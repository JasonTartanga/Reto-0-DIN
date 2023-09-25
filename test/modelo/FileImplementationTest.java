/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jason.
 */
public class FileImplementationTest {

    public FileImplementationTest() {
    }

    @Test
    public void testGetGreeting() {
        FileImplementation fileImplementation = new FileImplementation();
        assertEquals("Hello World From File", fileImplementation.getGreeting());
    }
}
