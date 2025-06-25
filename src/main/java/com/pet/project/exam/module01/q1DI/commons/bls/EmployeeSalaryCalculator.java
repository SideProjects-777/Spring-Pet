package com.pet.project.exam.module01.q1DI.commons.bls;


import com.pet.project.exam.module01.q1DI.commons.ds.Employee;
import com.pet.project.exam.module01.q1DI.commons.ds.EmployeeSalary;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class EmployeeSalaryCalculator {
    public List<EmployeeSalary> calculateSalaries(List<Employee> employees) {
        System.out.println("Calculating salaries");
        return Collections.emptyList();
    }
}
