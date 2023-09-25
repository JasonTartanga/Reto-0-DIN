/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

import modelo.*;

/**
 *
 * @author Jason.
 */
public class DBImplementationTest {

    public DBImplementationTest() {
    }

    @Test
    public void testAbrirConexion() {
        DBImplementation dbImplementation = new DBImplementation();

    }

    @Test
    public void testCerrarConexion() {
        DBImplementation dbImplementation = new DBImplementation();

    }

    @Test
    public void testGetGreating() {
        DBImplementation dbImplementation = new DBImplementation();
        assertEquals("Hola Mundo desde BD", dbImplementation.getGreating());
    }

}
