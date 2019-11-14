package com.test1.demo.repositories;
import com.test1.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
    Employee findByEmployeeId(Long id);
    Employee save(Employee employee);

}
