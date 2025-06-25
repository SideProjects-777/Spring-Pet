package com.pet.project.interview.dto;

import jakarta.validation.constraints.NotBlank;

public class ScanRequest {

    @NotBlank(message = "URL must not be blank")
    private String url;

    public ScanRequest() {
    }

    public ScanRequest(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
