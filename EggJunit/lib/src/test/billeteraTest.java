package lib.src.test;

import lib.src.Java.billetera;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class billeteraTest {
    
    private InputStream standardIn = System.in; 
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    billetera billetera1 = new billetera("Luis", 0);

    @BeforeEach
    void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }


    @AfterEach
    void close(){
        System.setOut(standardOut);
        System.setIn(standardIn);
        
    } 

    @Test
    @RepeatedTest(33)
    void testCargarSaldo() {
        String esperado = "El saldo actual es de : 1224.0";
        billetera1.cargarSaldo(1224);
        String resultado =  outputStreamCaptor.toString();
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void testMostrarDuenio() {
        String esperado = "El dueño de la billetera es : Luis";
        billetera1.mostrarDuenio();
        String resultado =  outputStreamCaptor.toString();
        Assertions.assertEquals(esperado,resultado);
    }


    @Test
    void testSetSaldo() {
        String esperado = "El saldo actual es de : 1.0";
        ByteArrayInputStream ingreso = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(ingreso);
        Scanner scan = new Scanner(System.in);
        billetera1.cargarSaldo(scan.nextFloat());
        String resultado =  outputStreamCaptor.toString();
        Assertions.assertEquals(esperado, resultado);
        
        scan.close();
    }

    
}
