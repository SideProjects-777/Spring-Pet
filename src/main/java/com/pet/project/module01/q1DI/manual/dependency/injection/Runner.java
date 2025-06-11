package com.pet.project.module01.q1DI.manual.dependency.injection;


import com.pet.project.module01.q1DI.commons.bls.EmployeeSalaryCalculator;
import com.pet.project.module01.q1DI.commons.dao.EmployeeDao;
import com.pet.project.module01.q1DI.commons.report.PdfSalaryReport;

public class Runner {
    public static void main(String... args) {
        EmployeesSalariesReportService employeesSalariesReportService = new EmployeesSalariesReportService(
                new EmployeeDao(),
                new EmployeeSalaryCalculator(),
                new PdfSalaryReport()
        );

        employeesSalariesReportService.generateReport();
    }
}
