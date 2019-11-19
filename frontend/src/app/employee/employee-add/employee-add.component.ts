import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';


@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  employee: Employee;

  constructor(private route: ActivatedRoute, private router: Router, private employeeService: EmployeeService) {
    this.employee = new Employee();
  }

  ngOnInit() {
  }
  onSubmit() {
    this.employeeService.save(this.employee).subscribe(result => this.gotoEmployeeList());
  }
  gotoEmployeeList() {
    this.router.navigate(['/employee']);
  }

}
