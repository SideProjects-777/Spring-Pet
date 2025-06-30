package com.pet.project.controller;

import com.pet.project.dto.IbanDTO;
import com.pet.project.model.Iban;
import com.pet.project.repository.IbanRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blacklist/ibans")
public class IbanController {

    private final IbanRepository ibanRepository;

    public IbanController(IbanRepository ibanRepository) {
        this.ibanRepository = ibanRepository;
    }

    @GetMapping
    public List<Iban> getAllIbans() {
        return ibanRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> addIban(@Valid @RequestBody IbanDTO request) {
        if (ibanRepository.exists(request.getIban())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("IBAN already blacklisted");
        }
        ibanRepository.save(new Iban(request.getIban()));
        return ResponseEntity.status(HttpStatus.CREATED).body("IBAN added to blacklist");
    }

    @DeleteMapping("/{iban}")
    public ResponseEntity<String> deleteIban(@PathVariable String iban) {
        if (ibanRepository.delete(iban)) {
            return ResponseEntity.ok("IBAN removed from blacklist");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("IBAN not found");
        }
    }

    @GetMapping("/{iban}")
    public ResponseEntity<Boolean> checkIban(@PathVariable String iban) {
        return ResponseEntity.ok(ibanRepository.exists(iban));
    }
}
