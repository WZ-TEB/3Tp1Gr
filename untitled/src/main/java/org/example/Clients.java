package org.example;

public interface Clients {
    String createNewClient(String firstName, String lastName);

    int getNumberOfClients();

    String getClientName(int clientId);

    String activatePremiumAccount(int clientId);

    boolean isClientPremium(int clientId);
}
