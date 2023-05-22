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
public class SlideBoxesTest {

    public SlideBoxesTest() {
    }

    @Test
    public void setUpClass() {
    }

    @Test
    public void tearDownClass() {
    }

    @Test
    public void setUp() {
    }

    @Test
    public void tearDown() {
    }

    /**
     * Test of slide method, of class SlideBoxes.
     */
    @Test
    public void testSlide1() {
        System.out.println("slide");
        int[][] matrix = {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 1, 0, 0},
            {1, 1, 1, 0}
        };
        int[][] result = SlideBoxes.slide(matrix);
        int[][] expected = {
            {0, 0, 0, 1},
            {0, 0, 0, 1},
            {0, 0, 1, 1},
            {0, 1, 1, 1}
        };
        assertEquals(result, expected);
    }

    @Test
    public void testSlide2() {
        System.out.println("slide");
        int[][] matrix = {
            {0, 0, 1, 0},
            {1, 0, 1, 0},
            {1, 1, 1, 0},
            {1, 1, 1, 1}
        };
        int[][] result = SlideBoxes.slide(matrix);
        int[][] expected = {
            {0, 0, 0, 1},
            {0, 0, 1, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1}
        };
        assertEquals(result, expected);
    }

    @Test
    public void testSlide3() {
        System.out.println("slide");
        int[][] matrix = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {1, 1, 1, 0}
        };
        int[][] result = SlideBoxes.slide(matrix);
        int[][] expected = {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 1, 1, 1}
        };
        assertEquals(result, expected);
    }
}
