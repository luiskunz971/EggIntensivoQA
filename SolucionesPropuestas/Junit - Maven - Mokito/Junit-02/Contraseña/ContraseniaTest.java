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
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ContraseniaTest {
    Contrasenia c1;

    @BeforeEach
    void setUp() {
        c1 = new Contrasenia();
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"Abc123!@#, La contraseña es segura.",
                "abcde1!@#, Debe tener al menos una letra mayúscula.",
                "Abc123lmn, Debe tener al menos una carácter especial."})
    void verificarContrasenia(String ingresoTeclado, String esperado) {
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        ByteArrayInputStream ingreso = new ByteArrayInputStream(ingresoTeclado.getBytes());
        System.setIn(ingreso);
        c1.verificarContrasenia();
        String resultado = outputStreamCaptor.toString();
        Assertions.assertTrue(resultado.contains(esperado));

    }

    @Test
    void esSeguraDatoValido() {
        String clave = "Abc123!@#";
        boolean resultado = c1.esSegura(clave);
        Assertions.assertTrue(resultado);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Ab1!@#", "abcde1!@#", "ABCDE1!@#", "AbcdeF!@#","Abc123lmn"})
    void esSeguraDatoNoValido(String clave) {
        boolean resultado = c1.esSegura(clave);
        Assertions.assertFalse(resultado);
    }


}