package com.osmodev.panier_client.app.application;

import com.osmodev.panier_client.app.domain.model.Panier;
import com.osmodev.panier_client.app.ports.output.TarificationFactoryPort;
import com.osmodev.panier_client.app.ports.output.TarificationPort;

import java.math.BigDecimal;

public class CalculPanierService implements CalculPanierUseCase {

    private final TarificationFactoryPort factory;

    public CalculPanierService(TarificationFactoryPort factory) {
        this.factory = factory;
    }

    @Override
    public BigDecimal calculerTotal(Panier panier) {
        TarificationPort tarification = factory.getTarification(panier.getClient());
        return panier.getProduits().stream()
                .map(p -> tarification.getPrix(p.getType()).multiply(BigDecimal.valueOf(p.getQuantite())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
