package com.osmodev.panier_client.app.ports.output;

import com.osmodev.panier_client.app.domain.model.TypeProduit;

import java.math.BigDecimal;

public interface TarificationPort {
    BigDecimal getPrix(TypeProduit typeProduit);
}
