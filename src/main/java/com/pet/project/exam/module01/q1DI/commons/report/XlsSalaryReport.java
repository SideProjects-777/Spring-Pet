package com.pet.project.exam.module01.q1DI.commons.report;


import com.pet.project.exam.module01.q1DI.commons.ds.EmployeeSalary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("xls-reports")
public class XlsSalaryReport implements SalaryReport {
    public void writeReport(List<EmployeeSalary> employeeSalaries) {
        System.out.println("Writing Xls Report");
    }
}
