package com.kabya.store.repositories;
import com.kabya.store.entity.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findAll();
    Employee findByEmployeeId(Long id);
    Employee save(Employee employee);

}
