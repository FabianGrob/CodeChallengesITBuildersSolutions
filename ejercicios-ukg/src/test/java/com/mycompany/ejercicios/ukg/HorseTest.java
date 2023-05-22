/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author fabian.grobert
 */
public class HorseTest {

    public HorseTest() {
    }

    @Test
    public void setUpClass() throws Exception {
    }

    @Test
    public void tearDownClass() throws Exception {
    }

    @Test
    public void setUp() throws Exception {
    }

    @Test
    public void tearDown() throws Exception {
    }

    @Test
    public void testStartingPosition44() {
        int startX = 4;
        int startY = 4;
        int expectedMoves = 63;
        int actualMoves = Horse.minMoves(startX, startY);
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testStartingPosition22() {
        int startX = 2;
        int startY = 2;
        int expectedMoves = 63;
        int actualMoves = Horse.minMoves(startX, startY);
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testStartingPosition33() {
        int startX = 3;
        int startY = 3;
        int expectedMoves = 63;
        int actualMoves = Horse.minMoves(startX, startY);
        assertEquals(expectedMoves, actualMoves);
    }

    @Test
    public void testInvalidStartingPosition88() {
        int startX = 7;
        int startY = 7;
        int expectedMoves = -1;
        int actualMoves = Horse.minMoves(startX, startY);
        assertEquals(expectedMoves, actualMoves);
    }

}
