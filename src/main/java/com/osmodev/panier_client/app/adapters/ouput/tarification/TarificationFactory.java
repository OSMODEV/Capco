package com.osmodev.panier_client.app.adapters.ouput.tarification;

import com.osmodev.panier_client.app.domain.model.Client;
import com.osmodev.panier_client.app.domain.model.ClientParticulier;
import com.osmodev.panier_client.app.domain.model.ClientProfessionnel;
import com.osmodev.panier_client.app.ports.output.TarificationFactoryPort;
import com.osmodev.panier_client.app.ports.output.TarificationPort;

import java.math.BigDecimal;

public class TarificationFactory implements TarificationFactoryPort {
    @Override
    public TarificationPort getTarification(Client client) {
        if (client instanceof ClientParticulier) {
            return new TarificationParticulier();
        }
        if (client instanceof ClientProfessionnel pro) {
            if (pro.getChiffreAffairesAnnuel().compareTo(BigDecimal.valueOf(10_000_000)) > 0) {
                return new TarificationGrosPro();
            } else {
                return new TarificationPetitPro();
            }
        }
        throw new IllegalArgumentException("Client inconnu");
    }
}
