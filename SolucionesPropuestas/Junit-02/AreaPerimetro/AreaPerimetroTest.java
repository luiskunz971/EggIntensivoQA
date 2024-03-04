package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AreaPerimetroTest {
    private AreaPerimetro ap1;
    private PrintStream standardOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private InputStream standardIn = System.in;

    @BeforeEach
    void setUp() {
        ap1 = new AreaPerimetro();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    void testCalcularPerimetroCirculo() {
        String esperado = "El perímetro es: 12.566370614359172";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("1\n1\n2\n".getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testCalcularAreaCirculo() {
        String esperado = "El área es: 12.566370614359172";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("1\n2\n2\n".getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testCalcularPerimetroTriangulo() {
        String esperado = "El perímetro es: 12.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("2\n1\n3\n5\n4\n".getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testCalcularAreaTriangulo() {
        String esperado = "El área es: 6.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("2\n2\n3\n4\n".getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testCalcularPerimetroParalelogramo() {
        String esperado = "El perímetro es: 14.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("3\n1\n4\n3\n".getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testCalcularAreaParalelogramo() {
        String esperado = "El área es: 12.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("3\n2\n4\n3\n".getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }
}