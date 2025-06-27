package com.pet.project.interview.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class Iban {

    @NotBlank(message = "IBAN must not be blank")
    @Pattern(regexp = "^[A-Z]{2}[0-9A-Z]{13,30}$", message = "Invalid IBAN format")
    private String iban;

    public Iban() {}

    public Iban(String iban) {
        this.iban = iban.toUpperCase().replaceAll("\\s+", "");
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban.toUpperCase().replaceAll("\\s+", "");
    }
}
