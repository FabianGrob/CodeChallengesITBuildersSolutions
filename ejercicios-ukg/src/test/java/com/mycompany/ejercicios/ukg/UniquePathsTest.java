/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import java.time.Duration;
import java.time.Instant;
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
public class UniquePathsTest {

    public UniquePathsTest() {
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

    @Test
    public void testUniquePaths_3x7() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(3, 7);
        assertEquals(28, result);
    }

    @Test
    public void testUniquePaths_3x2() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(3, 2);
        assertEquals(3, result);
    }

    @Test
    public void testUniquePaths_1x1() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(1, 1);
        assertEquals(1, result);
    }

    @Test
    public void testUniquePaths_2x2() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(2, 2);
        assertEquals(2, result);
    }

    @Test
    public void testUniquePaths_4x4() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(4, 4);
        assertEquals(20, result);
    }

    @Test
    public void testUniquePaths_1x10() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(1, 10);
        assertEquals(1, result);
    }

    @Test
    public void testUniquePaths_10x1() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(10, 1);
        assertEquals(1, result);
    }

    @Test
    public void testUniquePaths_5x8() {
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(5, 8);
        assertEquals(330, result);
    }

    @Test
    public void testUniquePaths_30x30() {
        Instant start = Instant.now();
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths(20000, 20000);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toSeconds();
        boolean timeout = timeElapsed <= 1;
        System.out.println(timeElapsed);

        assertTrue(timeout);
    }

    @Test
    public void testUniquePaths_timeout() {
        Instant start = Instant.now();
        UniquePaths uniquePaths = new UniquePaths();
        long result = uniquePaths.uniquePaths2(20000, 20000);
        long expected = 2399309444331282944L;

        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toSeconds();
        boolean timeout = timeElapsed <= 1;
        System.out.println(timeElapsed);
        assertTrue(timeout);
    }
}
