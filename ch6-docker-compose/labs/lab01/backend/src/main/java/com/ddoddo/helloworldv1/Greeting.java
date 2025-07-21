package com.ddoddo.helloworldv1;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "greetings")
@Getter
@Setter
public class Greeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "lang_code", unique = true)
    private String langCode;
    private String message;
}
