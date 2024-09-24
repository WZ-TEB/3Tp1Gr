package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClientsImplementationTest {
    private static final ClientsImplementation CLIENTS_IMPLEMENTATION_TEST = new ClientsImplementation();

    @Test
    void createNewClient() {
        //given
        ArrayList<Client> testArrayList = new ArrayList<>();
        //when
        CLIENTS_IMPLEMENTATION_TEST.createNewClient("testFirstName","testLastName");
        //then
        assertEquals(1, CLIENTS_IMPLEMENTATION_TEST.getNumberOfClients());
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