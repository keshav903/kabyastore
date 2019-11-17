package com.test1.demo.service;

import com.test1.demo.entity.Employee;
import com.test1.demo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.test1.demo.common.Action;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployee(){
        System.out.println("Getting all employees.");
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    public Employee findById(Long id){
        return employeeRepository.findByEmployeeId(id);
    }

    public Employee updateEmployee(Employee employee, Long id){
        Employee emp = employeeRepository.findByEmployeeId(id);
        if (emp == null){
            throw new NullPointerException("The employee with id does not exist.");
        }
        return synchronousAction(Action.update, employee);
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    private synchronized Employee synchronousAction(Action operationType, Employee employee){
        switch (operationType) {
            case delete:
                employeeRepository.delete(employee);
                break;
            case add:
            case update:
                employeeRepository.save(employee);
                break;
            default:
                break;
        }
        return employee;
    }


}
