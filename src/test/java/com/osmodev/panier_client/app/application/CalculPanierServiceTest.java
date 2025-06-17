package com.osmodev.panier_client.app.application;

import com.osmodev.panier_client.app.domain.model.*;

import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculPanierServiceTest {
    CalculPanierUseCase calculPanierUseCase;

    @Test
    void testCalculPanierPourClientParticulier() {
        Client client = new ClientParticulier("c1", "Dupont", "Jean");
        List<Produit> produits = List.of(
                new Produit(TypeProduit.TELEPHONE_HAUT_DE_GAMME, 1),
                new Produit(TypeProduit.ORDINATEUR_PORTABLE, 1)
        );
        Panier panier = new Panier(client, produits);

        CalculPanierUseCase service = new CalculPanierService();

        BigDecimal total = service.calculerTotal(panier);

        assertEquals(new BigDecimal("2700"), total); // 1500 + 1200
    }
}