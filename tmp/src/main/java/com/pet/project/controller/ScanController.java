package com.pet.project.controller;

import com.pet.project.dto.ScanRequest;
import com.pet.project.dto.ScanResponse;
import com.pet.project.services.InvoiceScanService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/scan-invoice")
public class ScanController {

    private final InvoiceScanService scanService;

    public ScanController(InvoiceScanService scanService) {
        this.scanService = scanService;
    }

    @PostMapping
    public ResponseEntity<ScanResponse> scanInvoice(@Valid @RequestBody ScanRequest request) {
        try {
            List<String> blacklistedIbans = scanService.scanInvoice(request.getUrl());

            if (!blacklistedIbans.isEmpty()) {
                ScanResponse response = new ScanResponse(true, blacklistedIbans);
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
            } else {
                ScanResponse response = new ScanResponse(false, List.of());
                return ResponseEntity.ok(response);
            }
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ScanResponse(false, List.of()));
        }
    }
}
