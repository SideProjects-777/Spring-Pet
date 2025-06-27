package com.pet.project.exam.module01.q3interface.dao;

import com.pet.project.exam.module01.q3interface.ds.FinancialMonthSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialQuarterSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialYearSummary;

public interface FinancialDataDao {
    FinancialYearSummary findFinancialYearSummary(int year);

    FinancialQuarterSummary findFinancialQuarterSummary(int year, int quarter);

    FinancialMonthSummary findFinancialMonthSummary(int year, int month);
}
