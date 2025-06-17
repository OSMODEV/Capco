package com.osmodev.panier_client.app.domain.model;

import java.math.BigDecimal;

public class ClientProfessionnel extends Client {
    private final String raisonSociale;
    private final String tvaIntraCommunautaire; // Peut être null
    private final String siren;
    private final BigDecimal chiffreAffairesAnnuel;

    public ClientProfessionnel(String id, String raisonSociale, String tvaIntraCommunautaire, String siren, BigDecimal chiffreAffairesAnnuel) {
        super(id);
        this.raisonSociale = raisonSociale;
        this.tvaIntraCommunautaire = tvaIntraCommunautaire;
        this.siren = siren;
        this.chiffreAffairesAnnuel = chiffreAffairesAnnuel;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public String getTvaIntraCommunautaire() {
        return tvaIntraCommunautaire;
    }

    public String getSiren() {
        return siren;
    }

    public BigDecimal getChiffreAffairesAnnuel() {
        return chiffreAffairesAnnuel;
    }
}
