/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

import java.util.Arrays;

/**
 *
 * @author fabian.grobert
 */
public class SlideBoxes {

    public static int[][] slide(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i]);
        }
     
        return matrix;
    }
}
