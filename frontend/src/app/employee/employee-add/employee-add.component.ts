import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import { EmployeeService } from '../employee.service';
import { Employee } from '../employee';
import { EmployeeType } from '../employee';


@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
  employee: Employee;

   private options: EmployeeType[];
    _employeeType: EmployeeType;


  constructor(private route: ActivatedRoute, private router: Router, private employeeService: EmployeeService) {
    this.employee = new Employee();
  }

  ngOnInit() {
            this.options = this.ToArray(EmployeeType)
  }
  //method to convert enum to array
  // Turn enum into array
  ToArray(enumme): EmployeeType[] {
     let liste: EmployeeType[] = [];
      for(var enumNum in enumme) {
            var isValueProperty = parseInt(enumNum, 10) >= 0
         if (isValueProperty) {
            liste.push(enumme[enumNum]);
         }
      }
      return liste;
  }
  addEmployee() {
  this.employee.employeeType = this._employeeType;
    this.employeeService.save(this.employee).subscribe(
                     result => this.gotoEmployeeList(),
                     error => console.log(error)
      );
  }
  gotoEmployeeList() {
    this.router.navigate(['/employee']);
  }


}
