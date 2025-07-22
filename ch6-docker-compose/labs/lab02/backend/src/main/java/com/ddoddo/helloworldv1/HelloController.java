package com.ddoddo.helloworldv1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
@CrossOrigin(origins = "*")
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello world !!!";
    }
}
