package com.ddoddo.helloworldv1;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class GreetingController {

    private final GreetingRepository repository;

    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting(@RequestParam String lang) {
        return repository.findByLangCode(lang)
                .map(g -> ResponseEntity.ok(g.getMessage()))
                .orElse(ResponseEntity.status(404).body("Language not supported"));
    }
}
