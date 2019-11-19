package com.test1.demo.web;

import com.test1.demo.entity.Employee;
import com.test1.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employee")
    public List<Employee> listEmployees(){
        return employeeService.findAllEmployee();
    }

    @GetMapping(value = "/employee/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeService.findById(id);
    }

    @PostMapping(value = "/employee")
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }

}
