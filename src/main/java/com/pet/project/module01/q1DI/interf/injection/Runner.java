package com.pet.project.module01.q1DI.interf.injection;


import com.pet.project.module01.q1DI.question01.commons.bls.EmployeeSalaryCalculator;
import com.pet.project.module01.q1DI.question01.commons.dao.EmployeeDao;
import com.pet.project.module01.q1DI.question01.commons.report.PdfSalaryReport;

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
