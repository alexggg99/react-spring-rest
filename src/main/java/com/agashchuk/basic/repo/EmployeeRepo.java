package com.agashchuk.basic.repo;

import com.agashchuk.basic.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepo extends PagingAndSortingRepository<Employee, Long> {
}
