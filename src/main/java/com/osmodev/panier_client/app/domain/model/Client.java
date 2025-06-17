package com.osmodev.panier_client.app.domain.model;


public abstract class Client {
    private String id;

    public Client(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
