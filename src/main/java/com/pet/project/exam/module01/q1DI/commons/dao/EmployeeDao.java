package com.pet.project.exam.module01.q1DI.commons.dao;


import com.pet.project.exam.module01.q1DI.commons.ds.Employee;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EmployeeDao {
    public List<Employee> findAll() {
        System.out.println("Finding all employees");
        return Collections.emptyList();
    }
}
