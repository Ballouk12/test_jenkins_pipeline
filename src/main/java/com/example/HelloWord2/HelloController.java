package com.example.HelloWord2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*") // Autoriser toutes les requêtes CORS
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    // Endpoint pour éviter l'erreur Whitelabel si quelqu'un va sur /
    @GetMapping("/")
    public String home() {
        return "Bienvenue sur l'API HelloWord2!";
    }
}
