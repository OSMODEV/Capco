package com.osmodev.panier_client.app.application;

import com.osmodev.panier_client.app.adapters.ouput.tarification.TarificationFactory;
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

        CalculPanierUseCase service = new CalculPanierService(new TarificationFactory());

        BigDecimal total = service.calculerTotal(panier);

        assertEquals(new BigDecimal("2700"), total); // 1500 + 1200
    }

    @Test
    void testCalculPanierPourClientGrosPro() {
        // Arrange
        ClientProfessionnel client = new ClientProfessionnel("P1", "Capco", "FR222222", "azerty", new BigDecimal(20_000_000L));
        List<Produit> produits = List.of(
                new Produit(TypeProduit.TELEPHONE_HAUT_DE_GAMME, 1),
                new Produit(TypeProduit.TELEPHONE_MOYEN_DE_GAMME, 2),
                new Produit(TypeProduit.ORDINATEUR_PORTABLE, 1)
        );
        Panier panier = new Panier(client, produits);

        CalculPanierUseCase service = new CalculPanierService(new TarificationFactory());

        // Act
        BigDecimal total = service.calculerTotal(panier);

        // Assert
        assertEquals(new BigDecimal("3000"), total);
    }

    @Test
    void testCalculPanierPourClientPetitPro() {
        // Arrange
        ClientProfessionnel client = new ClientProfessionnel("P2", "Osmodev", "FR55555", "qswxaz", new BigDecimal(250_000L));
        List<Produit> produits = List.of(
                new Produit(TypeProduit.TELEPHONE_HAUT_DE_GAMME, 2),
                new Produit(TypeProduit.TELEPHONE_MOYEN_DE_GAMME, 1),
                new Produit(TypeProduit.ORDINATEUR_PORTABLE, 1)
        );
        Panier panier = new Panier(client, produits);

        CalculPanierUseCase service = new CalculPanierService(new TarificationFactory());

        // Act
        BigDecimal total = service.calculerTotal(panier);

        // Assert
        assertEquals(new BigDecimal("3900"), total);
    }
}