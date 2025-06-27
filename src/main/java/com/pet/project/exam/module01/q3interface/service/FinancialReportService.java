package com.pet.project.exam.module01.q3interface.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.pet.project.exam.module01.q3interface.dao.FinancialDataDao;
import com.pet.project.exam.module01.q3interface.ds.FinancialMonthSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialQuarterSummary;
import com.pet.project.exam.module01.q3interface.ds.FinancialYearSummary;
import com.pet.project.exam.module01.q3interface.writer.FinancialReportWriter;

@Component
public class FinancialReportService {

    private final FinancialDataDao financialDataDao;
    private final FinancialReportWriter financialReportWriter;

    public FinancialReportService(@Qualifier("database-dao") FinancialDataDao financialDataDao, @Qualifier("database-writer") FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    public void generateReport() {
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2019);
        FinancialQuarterSummary financialQuarterSummary = financialDataDao.findFinancialQuarterSummary(2019, 1);
        FinancialMonthSummary financialMonthSummary = financialDataDao.findFinancialMonthSummary(2019, 4);

        financialReportWriter.appendFreeText("Year / Quarter / Month Financial Report");
        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
        financialReportWriter.appendFinancialQuarterSummary(financialQuarterSummary);
        financialReportWriter.appendFinancialMonthSummary(financialMonthSummary);
    }
}
