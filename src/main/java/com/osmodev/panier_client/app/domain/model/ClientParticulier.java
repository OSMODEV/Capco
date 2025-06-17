package com.osmodev.panier_client.app.domain.model;

public class ClientParticulier extends Client {
    private final String nom;
    private final String prenom;

    public ClientParticulier(String id, String nom, String prenom) {
        super(id);
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
