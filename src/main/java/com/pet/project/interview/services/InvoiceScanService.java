package com.pet.project.interview.services;

import com.pet.project.interview.interfaces.InvoiceScanner;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class InvoiceScanService {

    private final PdfService pdfService;
    private final InvoiceScanner ibanScanner;

    public InvoiceScanService(PdfService pdfService, InvoiceScanner ibanScanner) {
        this.pdfService = pdfService;
        this.ibanScanner = ibanScanner;
    }

    public List<String> scanInvoice(String pdfUrl) throws IOException {
        String text = pdfService.downloadAndExtractText(pdfUrl);
        return ibanScanner.scan(text);
    }
}
