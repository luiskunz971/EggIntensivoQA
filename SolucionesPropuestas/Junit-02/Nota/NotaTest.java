package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaTest {

    Nota n1;

    @BeforeEach
    void setUp() {
        n1 = new Nota();
    }

    @Test
    void obtenerNotaA() {
        String esperado = "A";
        int puntuacion = 90;
        String resultado = n1.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }

    @Test
    void obtenerNotaB() {
        String esperado = "B";
        int puntuacion = 80;
        String resultado = n1.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }

    @Test
    void obtenerNotaC() {
        String esperado = "C";
        int puntuacion = 70;
        String resultado = n1.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }

    @Test
    void obtenerNotaD() {
        String esperado = "D";
        int puntuacion = 60;
        String resultado = n1.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }


    @Test
    void obtenerNotaF() {
        String esperado = "F";
        int puntuacion = 59;
        String resultado = n1.obtenerNota(puntuacion);
        assertEquals(esperado, resultado);
    }

}