package com.pet.project.exam.module01.q1DI.manual.dependency.injection;



import com.pet.project.exam.module01.q1DI.commons.bls.EmployeeSalaryCalculator;
import com.pet.project.exam.module01.q1DI.commons.dao.EmployeeDao;
import com.pet.project.exam.module01.q1DI.commons.ds.Employee;
import com.pet.project.exam.module01.q1DI.commons.ds.EmployeeSalary;
import com.pet.project.exam.module01.q1DI.commons.report.SalaryReport;

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
