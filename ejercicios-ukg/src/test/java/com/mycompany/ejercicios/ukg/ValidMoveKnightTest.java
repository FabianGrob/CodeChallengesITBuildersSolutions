/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabian.grobert
 */
public class ValidMoveKnightTest {
    
    public ValidMoveKnightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isValidKnightMove method, of class ValidMoveKnight.
     */
   @Test
    public void testValidMove() {
        int initialX = 2;
        int initialY = 3;
        int newX = 4;
        int newY = 2;
        boolean isValid = ValidMoveKnight.isValidKnightMove(initialX, initialY, newX, newY);
        assertTrue(isValid);
    }

    @Test
    public void testInvalidMove() {
        int initialX = 2;
        int initialY = 3;
        int newX = 5;
        int newY = 2;
        boolean isValid = ValidMoveKnight.isValidKnightMove(initialX, initialY, newX, newY);
        assertFalse(isValid);
    }

    @Test
    public void testMoveToSamePosition() {
        int initialX = 2;
        int initialY = 3;
        int newX = 2;
        int newY = 3;
        boolean isValid = ValidMoveKnight.isValidKnightMove(initialX, initialY, newX, newY);
        assertFalse(isValid);
    }

    @Test
    public void testMoveOutsideBoard() {
        int initialX = 7;
        int initialY = 7;
        int newX = 9;
        int newY = 6;
        boolean isValid = ValidMoveKnight.isValidKnightMove(initialX, initialY, newX, newY);
        assertFalse(isValid);
    }

    @Test
    public void testMoveFromBoundaryToCenter() {
        int initialX = 7;
        int initialY = 7;
        int newX = 4;
        int newY = 4;
        boolean isValid = ValidMoveKnight.isValidKnightMove(initialX, initialY, newX, newY);
        assertFalse(isValid);
    }

    @Test
    public void testMoveFromCenterToBoundary() {
        int initialX = 4;
        int initialY = 4;
        int newX = 7;
        int newY = 7;
        boolean isValid = ValidMoveKnight.isValidKnightMove(initialX, initialY, newX, newY);
        assertFalse(isValid);
    }
}
