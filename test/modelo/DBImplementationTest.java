/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import model.DBImplementation;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Jason.
 */
public class DBImplementationTest {

    private DBImplementation dBImplementation;

    public DBImplementationTest() {
    }

    @Before
    public void setUp() {
        dBImplementation = new DBImplementation();
        dBImplementation.openConnection();
    }

    @Test
    public void testGetGreeting() {
        assertEquals("Hello World From DB", dBImplementation.getGreeting());
    }

    @After
    public void closeConection() {
        dBImplementation.closeConnection();
    }
}
