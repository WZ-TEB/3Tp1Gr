package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClientsImplementationTest {

    private static ClientsImplementation testClientsImplementation;

    @BeforeEach
    void init(){
        testClientsImplementation = new ClientsImplementation();
    }

    @Test
    void createNewClient() {
        //given
        //when
        testClientsImplementation.createNewClient("testFirstName","testLastName");
        //then
        assertEquals(1, testClientsImplementation.getNumberOfClients());
    }

    @Test
    void getClientName() {
        //given
        testClientsImplementation.createNewClient("testFirstName","testLastName");
        //when
        String testClientFullName = testClientsImplementation.getClientName(0);
        //then
        assertEquals("testFirstName testLastName",testClientFullName);
    }

    @Test
    void activatePremiumAccount() {
        //given
        testClientsImplementation.createNewClient("testFirstName","testLastName");
        //when
        testClientsImplementation.activatePremiumAccount(0);
        //then
        assertTrue(testClientsImplementation.isClientPremium(0));
    }
}