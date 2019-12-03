package com.kabya.store.web;

import com.kabya.store.service.EmployeeService;
import com.kabya.store.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //creating system log file and recording log, logger.info recorded for testing purpose
    private final Logger Logger = java.util.logging.Logger.getLogger(EmployeeController.class.getName());
    private FileHandler fileHandler;

    public EmployeeController() {
        try {
            fileHandler = new FileHandler("Serverlog.log",1024 * 8, 1, true);
            Logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            Logger.setLevel(Level.FINE);
            fileHandler.setLevel(Level.INFO);
        } catch (IOException io) {
            System.out.println("ERROR: Unable to set logging handler to file");
        }
    }
    @GetMapping(value = "/employee")
    public List<Employee> listEmployees(){
        Logger.info("Returning the list of employees");
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
