export class Employee {
  employeeId: number;
  firstName: string;
  lastName: string;
  email: string;
  mobile: number;
  address: string;
  entryDate: Date;
  annualSalary: number;
  employeeType: EmployeeType;
}
export enum EmployeeType {
    FULLTIME,
    PARTTIME,
    CONTRACT
}

