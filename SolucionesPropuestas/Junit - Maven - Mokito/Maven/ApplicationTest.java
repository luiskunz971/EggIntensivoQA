package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;


class ApplicationTest {

    Application app;

    @BeforeEach
    void setUp() {
        app = new Application();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/app.csv")
    void obtenerNota(String esperado, String puntuancionStr) {
        int puntuacion = Integer.parseInt(puntuancionStr);
        String resultado = app.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }


}
