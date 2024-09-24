package org.example;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void getClientName() {
        //given
        ArrayList<Client> testArrayList = new ArrayList<>();
        testClientsImplementation.createNewClient("testFirstName","testLastName");
        //when
        String testClientFullName = testClientsImplementation.getClientName(0);
        //then
        assertEquals("testFirstName testLastName",testClientFullName);
    }

    @Test
    void activatePremiumAccount() {
        //given
        ArrayList<Client> testArrayList = new ArrayList<>();
        testClientsImplementation.createNewClient("testFirstName","testLastName");
        //when
        testClientsImplementation.activatePremiumAccount(0);
        //then
        assertTrue(testClientsImplementation.isClientPremium(0));
    }
}