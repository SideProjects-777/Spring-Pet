package com.pet.project.exam.module01.q3interface.service;

import com.pet.project.exam.module01.q3interface.dao.FinancialDataDao;
import com.pet.project.exam.module01.q3interface.ds.FinancialYearSummary;
import com.pet.project.exam.module01.q3interface.writer.FinancialReportWriter;

class SimpleFinancialReportService {
    private final FinancialDataDao financialDataDao;
    private final FinancialReportWriter financialReportWriter;

    SimpleFinancialReportService(FinancialDataDao financialDataDao, FinancialReportWriter financialReportWriter) {
        this.financialDataDao = financialDataDao;
        this.financialReportWriter = financialReportWriter;
    }

    void generateReport() {
        FinancialYearSummary financialYearSummary = financialDataDao.findFinancialYearSummary(2019);

        financialReportWriter.appendFinancialYearSummary(financialYearSummary);
    }
}
