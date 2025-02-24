package com.egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.List;

class ApplicationTest {
    List<String> mockedList = mock(List.class);

    @Test
void createMockObject() {
// Crear un mock de la interfaz List

//Verificar que el metodo size() devuelve 10
assertEquals(0, mockedList.size());

}

void verificarMetodo() {
    mockedList.add("un elemento");

    verify(mockedList).add("un elemento");
}
}
