package com.pet.project.module01.q1DI.commons.report;



import com.pet.project.module01.q1DI.commons.ds.EmployeeSalary;

import java.util.List;

public interface SalaryReport {
    void writeReport(List<EmployeeSalary> employeeSalaries);
}
