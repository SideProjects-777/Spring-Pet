package com.pet.project.exam.module01.q1DI.no.dependency.injection;

public class Runner {
    public static void main(String... args) {
        EmployeesSalariesReportService employeesSalariesReportService = new EmployeesSalariesReportService();

        employeesSalariesReportService.generateReport();
    }
}
