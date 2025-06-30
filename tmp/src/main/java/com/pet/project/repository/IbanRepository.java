package com.pet.project.repository;

import com.pet.project.model.Iban;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class IbanRepository {

    private final Set<String> ibans = ConcurrentHashMap.newKeySet();

    public List<Iban> findAll() {
        List<Iban> list = new ArrayList<>();
        ibans.forEach(iban -> list.add(new Iban(iban)));
        return list;
    }

    public Optional<Iban> findByIban(String iban) {
        String normalized = normalize(iban);
        if (ibans.contains(normalized)) {
            return Optional.of(new Iban(normalized));
        }
        return Optional.empty();
    }

    public boolean exists(String iban) {
        return ibans.contains(normalize(iban));
    }

    public void save(Iban iban) {
        ibans.add(normalize(iban.getIban()));
    }

    public boolean delete(String iban) {
        return ibans.remove(normalize(iban));
    }

    private String normalize(String iban) {
        return iban.toUpperCase().replaceAll("\\s+", "");
    }
}
