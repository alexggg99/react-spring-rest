package com.agashchuk.basic;

import com.agashchuk.basic.model.Employee;
import com.agashchuk.basic.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepo repository;

    @Autowired
    public DatabaseLoader(EmployeeRepo repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Employee("Alex", "Smith", "runner"));
    }
}
