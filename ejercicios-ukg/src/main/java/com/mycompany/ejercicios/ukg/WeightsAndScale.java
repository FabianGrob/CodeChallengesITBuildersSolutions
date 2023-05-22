/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author fabian.grobert
 */
public class WeightsAndScale {

    public static int weightTimes = 0;

    public static int[] scale(int[] balls) {
        weightTimes = 0;
        //TODO
        WeightResult weight = haveSameWeight(balls[0] + balls[1] + balls[2], balls[3] + balls[4] + balls[5]);
        if (weight != WeightResult.SameWeight) {
            if (weight == WeightResult.Left) {
                weight = haveSameWeight(balls[0], balls[1]);
                switch (weight) {
                    case Left -> {
                        int[] result = {0, weightTimes};
                        return result;
                    }
                    case Right -> {
                        int[] result = {1, weightTimes};
                        return result;
                    }
                    case SameWeight -> {
                        int[] result = {2, weightTimes};
                        return result;
                    }
                    default ->
                        throw new AssertionError();
                }

            } else if (weight == WeightResult.Right) {
                weight = haveSameWeight(balls[3], balls[4]);
                switch (weight) {
                    case Left -> {
                        int[] result = {3, weightTimes};
                        return result;
                    }
                    case Right -> {
                        int[] result = {4, weightTimes};
                        return result;
                    }
                    case SameWeight -> {
                        int[] result = {5, weightTimes};
                        return result;
                    }
                    default ->
                        throw new AssertionError();
                }

            }
        } else if (weight == WeightResult.SameWeight) {
            int[] result = {6, weightTimes};
            return result;
        }

        int[] result = {-1, weightTimes};
        return result;
    }

    private static WeightResult haveSameWeight(int a, int b) {
        weightTimes++;
        if (a > b) {
            return WeightResult.Left;
        }
        if (b > a) {
            return WeightResult.Right;
        }
        return WeightResult.SameWeight;
    }

    public enum WeightResult {
        SameWeight,
        Right,
        Left
    }
}
