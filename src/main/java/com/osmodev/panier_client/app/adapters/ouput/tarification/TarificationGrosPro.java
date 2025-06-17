package com.osmodev.panier_client.app.adapters.ouput.tarification;

import com.osmodev.panier_client.app.domain.model.TypeProduit;
import com.osmodev.panier_client.app.ports.output.TarificationPort;

import java.math.BigDecimal;

public class TarificationGrosPro implements TarificationPort {
    @Override
    public BigDecimal getPrix(TypeProduit typeProduit) {
        return switch (typeProduit) {
            case TELEPHONE_HAUT_DE_GAMME -> BigDecimal.valueOf(1000);
            case TELEPHONE_MOYEN_DE_GAMME -> BigDecimal.valueOf(550);
            case ORDINATEUR_PORTABLE -> BigDecimal.valueOf(900);
        };
    }
}
