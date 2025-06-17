package com.osmodev.panier_client.app.application;

import com.osmodev.panier_client.app.domain.model.Panier;

import java.math.BigDecimal;

public class CalculPanierService implements CalculPanierUseCase {

    @Override
    public BigDecimal calculerTotal(Panier panier) {
        return BigDecimal.ZERO;
    }
}
