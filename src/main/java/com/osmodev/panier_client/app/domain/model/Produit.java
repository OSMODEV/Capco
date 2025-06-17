package com.osmodev.panier_client.app.domain.model;

public class Produit {
    private final TypeProduit type;
    private final int quantite;

    public Produit(TypeProduit type, int quantite) {
        if (type == null) {
            throw new IllegalArgumentException("Le type de produit est obligatoire.");
        }
        if (quantite <= 0) {
            throw new IllegalArgumentException("La quantité doit être supérieure à 0.");
        }
        this.type = type;
        this.quantite = quantite;
    }

    public TypeProduit getType() {
        return type;
    }

    public int getQuantite() {
        return quantite;
    }
}
