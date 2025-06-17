package com.osmodev.panier_client.adapters.input.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PanierController {
    @GetMapping("/calcul-panier")
    public String home() {
        return "L'application fonctionne 🚀";
    }
}