package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientsImplementationTest {
    private static final ClientsImplementation testClientsImplementation = new ClientsImplementation();

    @Test
    void createNewClient() {
        //given
        ArrayList<Client> testArrayList = new ArrayList<>();
        //when
        testClientsImplementation.createNewClient("testFirstName","testLastName");
        //then
        assertEquals(1, testClientsImplementation.getNumberOfClients());
    }

    @Test
    void getNumberOfClients() {
    }

    @Test
    void getClientName() {
    }

    @Test
    void activatePremiumAccount() {
    }

    @Test
    void isClientPremium() {
    }
}