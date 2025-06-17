package com.osmodev.panier_client.app.application;

import com.osmodev.panier_client.app.adapters.ouput.tarification.TarificationParticulier;
import com.osmodev.panier_client.app.domain.model.Panier;
import com.osmodev.panier_client.app.ports.output.TarificationPort;

import java.math.BigDecimal;

public class CalculPanierService implements CalculPanierUseCase {

    @Override
    public BigDecimal calculerTotal(Panier panier) {
        TarificationPort tarification = new TarificationParticulier();
        return panier.getProduits().stream()
                .map(p -> tarification.getPrix(p.getType()).multiply(BigDecimal.valueOf(p.getQuantite())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
