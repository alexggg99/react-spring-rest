package com.agashchuk.basic.repo;

import com.agashchuk.basic.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {
}
