package com.osmodev.panier_client.app.ports.output;

import com.osmodev.panier_client.app.domain.model.Client;

public interface TarificationFactoryPort {
    TarificationPort getTarification(Client client);
}
