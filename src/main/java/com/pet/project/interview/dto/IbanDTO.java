package com.pet.project.interview.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class IbanDTO {

    @NotBlank(message = "IBAN must not be blank")
    @Pattern(regexp = "^[A-Z]{2}[0-9A-Z]{13,30}$", message = "Invalid IBAN format")
    private String iban;

    public IbanDTO() {
    }

    public IbanDTO(String iban) {
        this.iban = iban;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
