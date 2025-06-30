package com.pet.project.components;

import com.pet.project.interfaces.InvoiceScanner;
import com.pet.project.repository.IbanRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class IbanScanner implements InvoiceScanner {

    private final IbanRepository ibanRepository;

    private static final Pattern IBAN_PATTERN = Pattern.compile(
            "\\b([A-Z]{2}[0-9]{2}(?:\\s?[A-Z0-9]{4}){1,7}\\s?[A-Z0-9]{0,3})\\b"
    );

    public IbanScanner(IbanRepository ibanRepository) {
        this.ibanRepository = ibanRepository;
    }

    @Override
    public List<String> scan(String text) {
        List<String> foundBlacklisted = new ArrayList<>();
        Matcher matcher = IBAN_PATTERN.matcher(text);

        while (matcher.find()) {
            String foundIban = matcher.group(1).replaceAll("\\s+", "");

            if (ibanRepository.exists(foundIban)) {
                foundBlacklisted.add(foundIban);
            }
        }
        return foundBlacklisted;
    }
}