package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @CsvSource({"'1 1 2 ', El perímetro es: 12.566370614359172", //Datos Perimetro Circulo
                "'1 2 2 ', El área es: 12.566370614359172",      //Datos Area Circulo
                "'2 1 3 5 4 ', El perímetro es: 12.0",           //Datos Perimetro Triangulo
                "'2 2 3 4 ', El área es: 6.0",                   //Datos Area Triangulo
                "'3 1 4 3 ', El perímetro es: 14.0",             //Datos Perimetro Paralelogramo
                "'3 2 4 3 ', El área es: 12.0"})                 //Datos Area Paralelogramo
    void testCalcularPerimetroArea(String ingresoTeclado, String esperado) {
        ByteArrayInputStream ingreso = new ByteArrayInputStream(ingresoTeclado.getBytes());
        System.setIn(ingreso);
        ap1.calculadora();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));
    }


}