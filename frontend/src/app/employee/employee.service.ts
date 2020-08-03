import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Employee} from './employee';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private employeeUrl: string;

  constructor(private http: HttpClient) {
      this.employeeUrl = 'http://localhost:8083/employee';
  }
  public findAll(){
    return this.http.get<Employee[]>(this.employeeUrl);
  }
  public findEmployee(id: number) {
    return this.http.get<Employee>(this.employeeUrl + '/' + id);
  }
  public save(employee: Employee) {
    return this.http.post<Employee>(this.employeeUrl, employee);
  }
}
