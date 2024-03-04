package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParImparTest {

    ParImpar parImpar;

    @BeforeEach
    void setUp() {
        parImpar = new ParImpar();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSolicitarNumero(){
        //No lo indica pero pruebo que mi metodo devuelva un entero entre 20 y 50
        int numero = parImpar.solicitarNumero();
        boolean esperado = numero >= 20 && numero <= 50;
        Assertions.assertTrue(esperado);
    }

    @Test
    void TestesPar() {
        int numero =  parImpar.solicitarNumero();
        boolean resultado = parImpar.esPar(numero);
        if (numero % 2 == 0){
            Assertions.assertTrue(resultado);
        } else {
            Assertions.assertFalse(resultado);
        };
    }
}