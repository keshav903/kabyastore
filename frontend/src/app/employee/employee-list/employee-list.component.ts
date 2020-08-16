import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];
  public showDetail: boolean = true;
  public currentEmployee: Employee;
  selectedId: number;

  constructor(private employeeService: EmployeeService, private router: Router, private route: ActivatedRoute) { }

  ngOnInit() {
    this.employeeService.findAll().subscribe(data => {
      this.employees = data;
    });
    this.route.paramMap.subscribe((params: ParamMap) => {
       let id = parseInt(params.get('id'));
       this.selectedId = id;
    });
  }
 showDetails(employee) {
   // let selectedId = this.employeeId;
   //this.router.navigate(['/employee.employeeId'], employee.employeeId)
    this.router.navigate([employee.employeeId], {relativeTo: this.route});
  }

  isSelected(employee) {
      return employee.employeeId === this.selectedId;
  }

}
