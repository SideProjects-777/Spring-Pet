package com.pet.project.exam.module01.q3interface.writer;


import org.springframework.stereotype.Component;

import com.pet.project.exam.module01.q3interface.ds.FinancialMonthSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialQuarterSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialYearSummary;

@Component("file-writer")
class FileStoreFinancialReportWriter implements FinancialReportWriter {
    @Override
    public void appendFreeText(String title) {
        System.out.println("File Writer => appendFreeText");
    }

    @Override
    public void appendFinancialYearSummary(FinancialYearSummary financialYearSummary) {
        System.out.println("File Writer => appendFinancialYearSummary");
    }

    @Override
    public void appendFinancialQuarterSummary(FinancialQuarterSummary financialQuarterSummary) {
        System.out.println("File Writer => appendFinancialQuarterSummary");
    }

    @Override
    public void appendFinancialMonthSummary(FinancialMonthSummary financialMonthSummary) {
        System.out.println("File Writer => appendFinancialMonthSummary");
    }
}
