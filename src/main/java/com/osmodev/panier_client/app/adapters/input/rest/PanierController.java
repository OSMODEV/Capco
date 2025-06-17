package com.osmodev.panier_client.adapters.input.rest;

import com.osmodev.panier_client.app.adapters.ouput.tarification.TarificationFactory;
import com.osmodev.panier_client.app.application.CalculPanierService;
import com.osmodev.panier_client.app.application.CalculPanierUseCase;
import com.osmodev.panier_client.app.domain.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class PanierController {
    @GetMapping("/calcul-panier")
    public String home() {
        Client client = new ClientParticulier("c1", "Dupont", "Jean");
        List<Produit> produits = List.of(
                new Produit(TypeProduit.TELEPHONE_HAUT_DE_GAMME, 1),
                new Produit(TypeProduit.ORDINATEUR_PORTABLE, 1)
        );
        Panier panier = new Panier(client, produits);

        CalculPanierUseCase service = new CalculPanierService(new TarificationFactory());

        BigDecimal total = service.calculerTotal(panier);
        return "Le client M. Dupont a un panier d'une valeur de " + total.toPlainString();
    }
}