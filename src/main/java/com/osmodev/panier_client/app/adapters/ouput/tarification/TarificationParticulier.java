package com.osmodev.panier_client.app.adapters.ouput.tarification;

import com.osmodev.panier_client.app.domain.model.TypeProduit;
import com.osmodev.panier_client.app.ports.output.TarificationPort;

import java.math.BigDecimal;

/**
 * On peut imaginer que dans une version plus poussé cette classe aille dans le package jpa
 * **/
public class TarificationParticulier implements TarificationPort {
    @Override
    public BigDecimal getPrix(TypeProduit typeProduit) {
        return switch (typeProduit) {
            case TELEPHONE_HAUT_DE_GAMME -> BigDecimal.valueOf(1500);
            case TELEPHONE_MOYEN_DE_GAMME -> BigDecimal.valueOf(800);
            case ORDINATEUR_PORTABLE -> BigDecimal.valueOf(1200);
        };
    }
}
