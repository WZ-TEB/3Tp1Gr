package org.example;

import java.util.ArrayList;

public class ClientsImplementation implements Clients {

    public ArrayList<Client> clientArrayList = new ArrayList<>();

    @Override
    public String createNewClient(String firstName, String lastName) {
        Client client = new Client(firstName, lastName);
        clientArrayList.add(client);
        client.setClientId(clientArrayList.size());
        return null;
    }

    @Override
    public int getNumberOfClients() {
        return clientArrayList.size();
    }

    @Override
    public String getClientName(int clientId) {
        return clientArrayList.get(clientId).getFirstName() + " " + clientArrayList.get(clientId).getLastName();
    }

    @Override
    public String activatePremiumAccount(int clientId) {
        Client client = clientArrayList.get(clientId);
        client.setPremium(true);
        clientArrayList.set(clientId, client);
        return "Client Premium status set to true";
    }

    @Override
    public boolean isClientPremium(int clientId) {
        Client client = clientArrayList.get(clientId);
        return client.isPremium();
    }
}
