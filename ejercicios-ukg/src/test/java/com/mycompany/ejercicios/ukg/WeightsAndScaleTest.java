/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabian.grobert
 */
public class WeightsAndScaleTest {

    public WeightsAndScaleTest() {
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
     * Test of scale method, of class WeightsAndScale.
     */
    @Test
    public void testScale0() {
        int[] balls = {2, 1, 1, 1, 1, 1, 1};
        int[] expectedResult = {
            0, 2};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testScale1() {
        int[] balls = {1, 4, 1, 1, 1, 1, 1};
        int[] expectedResult = {
            1, 2};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testScale2() {
        int[] balls = {1, 1, 6, 1, 1, 1, 1};
        int[] expectedResult = {
            2, 2};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testScale3() {
        int[] balls = {1, 1, 1, 5, 1, 1, 1};
        int[] expectedResult = {
            3, 2};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testScale4() {
        int[] balls = {1, 1, 1, 1, 999, 1, 1};
        int[] expectedResult = {
            4, 2};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testScale5() {
        int[] balls = {1, 1, 1, 1, 1, 15, 1};
        int[] expectedResult = {
            5, 2};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testScale6() {
        int[] balls = {1, 1, 1, 1, 1, 1, 11};
        int[] expectedResult = {
            6, 1};
        int[] result = WeightsAndScale.scale(balls);
        Assert.assertArrayEquals(expectedResult, result);
    }
}
