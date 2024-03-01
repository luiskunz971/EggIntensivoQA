package lib.src.test;

import lib.src.Java.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


import org.junit.jupiter.api.*;

public class MainTest {
    
    private InputStream standardIn = System.in;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    @BeforeEach 
    public void setUp() {
        
    }
    
    @AfterEach
    public void tearDown() {
        System.setOut (standardOut); 
        // System.setIn (standardIn);
    }
    
    // @Test
    // public void testObtenerNumero() {
    //     ByteArrayInputStream in = new ByteArrayInputStream("1\n".getBytes());System.setIn(in);
    // }

    @Test
    void testMain() {
        mainEj.main(new String[1]);
        String salida = outputStreamCaptor.toString();
        Assertions.assertEquals("Hello World!\r\n", salida);
    }


}
