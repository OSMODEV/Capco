package com.osmodev.panier_client.app.application;

import com.osmodev.panier_client.app.domain.model.Panier;

import java.math.BigDecimal;

public interface CalculPanierUseCase {
    BigDecimal calculerTotal(Panier panier);
}
