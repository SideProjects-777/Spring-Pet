package com.pet.project.interview.dto;

import java.util.List;

public class ScanResponse {

    private boolean blacklistedFound;

    private List<String> blacklistedIBANs;

    public ScanResponse() {
    }

    public ScanResponse(boolean blacklistedFound, List<String> blacklistedIBANs) {
        this.blacklistedFound = blacklistedFound;
        this.blacklistedIBANs = blacklistedIBANs;
    }

    public boolean isBlacklistedFound() {
        return blacklistedFound;
    }

    public void setBlacklistedFound(boolean blacklistedFound) {
        this.blacklistedFound = blacklistedFound;
    }

    public List<String> getBlacklistedIBANs() {
        return blacklistedIBANs;
    }

    public void setBlacklistedIBANs(List<String> blacklistedIBANs) {
        this.blacklistedIBANs = blacklistedIBANs;
    }
}
