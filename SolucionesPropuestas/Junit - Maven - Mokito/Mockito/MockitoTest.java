package org.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Mockito1Test {

    //Ejercicio 1
    @Test
    public void createMockObject1() {
        // Crear un objeto simulado de la clase List
        List<String> listaMockeada = mock(List.class);

        // Llamar al método size() del objeto simulado
        int tamañoLista = listaMockeada.size();

        // Verificar que el tamaño de la lista es 0
        verify(listaMockeada).size();
        assertEquals(0, tamañoLista);
    }

    //Ejercicio 2
    @Test
    public void configureMockObject() {
        // Crear y configurar un objeto simulado de la clase List
        List<String> listaMockeada = mock(List.class);
        when(listaMockeada.size()).thenReturn(10);

        // Llamar al método size() del objeto simulado
        int tamañoLista = listaMockeada.size();

        // Verificar que el tamaño de la lista es el valor configurado
        verify(listaMockeada).size();
        assertEquals(10, tamañoLista);
    }

    //Ejercicio 3
    @Test
    public void verifyInteraction() {
        // Crear un objeto simulado de la clase List
        List<String> listaMockeada = mock(List.class);

        // Llamar al método add() del objeto simulado con un elemento
        listaMockeada.add("Elemento1");

        // Verificar que el método add() ha sido llamado
        verify(listaMockeada).add("Elemento1");
    }

    //Ejercicio 4
    @Test
    public void createSpyObject() {
        // Crear un objeto espía de la clase ArrayList
        List<String> listaEspia = spy(new ArrayList<>());

        // Añadir un elemento al objeto espía
        listaEspia.add("Elemento");

        // Llamar al método size() del objeto simulado
        int tamañoLista = listaEspia.size();

        // Verificar que el método add() y size() han sido llamados
        verify(listaEspia).add("Elemento");

        // Verificar que el tamaño de la lista es 1
        assertEquals(1, tamañoLista);
    }



}