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

class CalculadoraTest {

    private Calculadora c1;
    private PrintStream standardOut = System.out;
    private ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private InputStream standardIn = System.in;


    @BeforeEach
    void setUp() {
        c1 = new Calculadora();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    void testMenuIngresandoOpcionNoValida() {
        String esperado1 = "Opción no válida. Intente de nuevo.\r\n";
        String esperado2 = "Saliendo de la calculadora...\r\n";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("10\n5\n".getBytes());
        System.setIn(ingreso);
        c1.menu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado1) && resultado.contains(esperado2));
    }

    @Test
    void mostrarMenu() {
        String esperado = "-------------------\r\n" +
                "**CALCULADORA**\r\n" +
                "-------------------\r\n" +
                "1. Sumar\r\n" +
                "2. Restar\r\n" +
                "3. Multiplicar\r\n" +
                "4. Dividir\r\n" +
                "5. Salir\r\n" +
                "-------------------\r\n" +
                "Ingrese una opción: \r\n";
        c1.mostrarMenu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertEquals(esperado,resultado);
    }

    @Test
    void testSumar() {
        String esperado = "La suma de 2 y 3 es: 5.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("1\n2\n3\n5".getBytes());
        System.setIn(ingreso);
        c1.menu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testRestar() {
        String esperado = "La resta de 2 y 3 es: -1.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("2\n2\n3\n5".getBytes());
        System.setIn(ingreso);
        c1.menu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testMultiplicar() {
        String esperado = "La multiplicación de 2 y 3 es: 6.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("3\n2\n3\n5".getBytes());
        System.setIn(ingreso);
        c1.menu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testDividirPor0() {
        String esperado = "No se puede dividir por 0.";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("4\n10\n0\n5".getBytes());
        System.setIn(ingreso);
        c1.menu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

    @Test
    void testDividirConDatosValidos() {
        String esperado = "La división de 10 y 5 es: 2";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("4\n10\n5\n5".getBytes());
        System.setIn(ingreso);
        c1.menu();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }

}