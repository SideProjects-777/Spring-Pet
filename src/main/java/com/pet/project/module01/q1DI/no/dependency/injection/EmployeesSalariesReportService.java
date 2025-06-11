package com.pet.project.module01.q1DI.no.dependency.injection;


import com.pet.project.module01.q1DI.commons.bls.EmployeeSalaryCalculator;
import com.pet.project.module01.q1DI.commons.dao.EmployeeDao;
import com.pet.project.module01.q1DI.commons.ds.Employee;
import com.pet.project.module01.q1DI.commons.ds.EmployeeSalary;
import com.pet.project.module01.q1DI.commons.report.PdfSalaryReport;

import java.util.List;

class EmployeesSalariesReportService {
    void generateReport() {
        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employees = employeeDao.findAll();

        EmployeeSalaryCalculator employeeSalaryCalculator = new EmployeeSalaryCalculator();
        List<EmployeeSalary> employeeSalaries = employeeSalaryCalculator.calculateSalaries(employees);

        PdfSalaryReport pdfSalaryReport = new PdfSalaryReport();
        pdfSalaryReport.writeReport(employeeSalaries);
    }
}
