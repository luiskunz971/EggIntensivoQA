package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    Nota n1;

    @BeforeEach
    void setUp() {
        n1 = new Nota();
    }

    @ParameterizedTest
    @CsvSource({"A, 100",
                "A, 95",
                "A, 90",
                "B, 89",
                "B, 85",
                "B, 80",
                "C, 79",
                "C, 75",
                "C, 70",
                "D, 69",
                "D, 60",
                "F, 59"})
    void obtenerNota(String esperado, String puntuancionStr) {
        int puntuacion = Integer.parseInt(puntuancionStr);
        String resultado = n1.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }



}