package com.pet.project.services;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Service
public class PdfService {

    private final RestTemplate restTemplate = new RestTemplate();


    public String downloadAndExtractText(String pdfUrl) throws IOException {
        byte[] pdfBytes = restTemplate.getForObject(pdfUrl, byte[].class);
        if (pdfBytes == null || pdfBytes.length == 0) {
            throw new IOException("Failed to download PDF or empty content");
        }

        try (PDDocument document = PDDocument.load(new ByteArrayInputStream(pdfBytes))) {
            PDFTextStripper stripper = new PDFTextStripper();
            return stripper.getText(document);
        }
    }
}
