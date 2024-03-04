package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class NombreEdadTest {

    @Test
    void saludar() {
        //Instancio los objetos necesarios
        NombreEdad ne1 = new NombreEdad();
        PrintStream standardOut = System.out;
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));

        //Defino el mensaje que espero que se muestre.
        //Llamo al metodo saludar de mi objeto ne1.
        //Capturo lo que se el sout de la funcion saludar.
        String esperado = "Hola me llamo Luis y tengo 32 años.";
        ne1.saludar("Luis",32);
        String reultado = outputStreamCaptor.toString();

        //Verifico el resultado obtenido con el esperado.
        Assertions.assertEquals(esperado,reultado);

        System.setOut(standardOut);

    }
}