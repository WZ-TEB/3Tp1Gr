package org.example;

public interface Clients {
    void createNewClient(String firstName, String lastName);

    int getNumberOfClients();

    String getClientName(int clientId);

    void activatePremiumAccount(int clientId);

    boolean isClientPremium(int clientId);
}
