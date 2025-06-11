package com.pet.project.module01.q1DI.spring.dependency.injection;


import com.pet.project.module01.q1DI.commons.bls.EmployeeSalaryCalculator;
import com.pet.project.module01.q1DI.commons.dao.EmployeeDao;
import com.pet.project.module01.q1DI.commons.ds.Employee;
import com.pet.project.module01.q1DI.commons.ds.EmployeeSalary;
import com.pet.project.module01.q1DI.commons.report.SalaryReport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
