package com.pet.project.exam.module01.q3interface.dao;

import org.springframework.stereotype.Component;

import com.pet.project.exam.module01.q3interface.ds.FinancialMonthSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialQuarterSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialYearSummary;

@Component("database-dao")
class DatabaseStoreFinancialDataDao implements FinancialDataDao {
    @Override
    public FinancialYearSummary findFinancialYearSummary(int year) {
        System.out.println("Database Dao => findFinancialYearSummary");
        return new FinancialYearSummary();
    }

    @Override
    public FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter) {
        System.out.println("Database Dao => findFinancialQuarterSummary");
        return new FinancialQuarterSummary();
    }

    @Override
    public FinancialMonthSummary findFinancialMonthSummary(int year, int month) {
        System.out.println("Database Dao => findFinancialMonthSummary");
        return new FinancialMonthSummary();
    }
}
