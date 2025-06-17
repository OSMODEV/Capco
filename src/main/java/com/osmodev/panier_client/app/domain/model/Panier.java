package com.osmodev.panier_client.app.domain.model;

import java.util.List;

public class Panier {
    private final Client client;
    private final List<Produit> produits;

    public Panier(Client client, List<Produit> produits) {
        if (client == null) {
            throw new IllegalArgumentException("Le client est obligatoire.");
        }
        if (produits == null || produits.isEmpty()) {
            throw new IllegalArgumentException("Le panier doit contenir au moins un produit.");
        }
        this.client = client;
        this.produits = List.copyOf(produits); // Immuable
    }

    public Client getClient() {
        return client;
    }

    public List<Produit> getProduits() {
        return produits;
    }
}
