package com.pet.project.module01.q1DI.interf.injection;



import com.pet.project.module01.q1DI.question01.commons.bls.EmployeeSalaryCalculator;
import com.pet.project.module01.q1DI.question01.commons.dao.EmployeeDao;

import com.pet.project.module01.q1DI.question01.commons.ds.Employee;
import com.pet.project.module01.q1DI.question01.commons.ds.EmployeeSalary;
import com.pet.project.module01.q1DI.question01.commons.report.SalaryReport;

import java.util.List;

class EmployeesSalariesReportService {
    private final EmployeeDao employeeDao;
    private final EmployeeSalaryCalculator employeeSalaryCalculator;
    private final SalaryReport salaryReport;

    EmployeesSalariesReportService(EmployeeDao employeeDao, EmployeeSalaryCalculator employeeSalaryCalculator, SalaryReport salaryReport) {
        this.employeeDao = employeeDao;
        this.employeeSalaryCalculator = employeeSalaryCalculator;
        this.salaryReport = salaryReport;
    }

    void generateReport() {
        List<Employee> employees = employeeDao.findAll();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        salaryReport.writeReport(employeeSalaries);
    }
}
