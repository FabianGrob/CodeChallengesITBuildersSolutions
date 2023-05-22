/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

/**
 *
 * @author fabian.grobert
 */
public class AllGreaterThan {

    public static boolean AllGreaterThan(int[] a, int[] b) {
        //TODO
        int minA = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minA) {
                minA = a[i];
            }
        }
        int maxB = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > maxB) {
                maxB = b[i];
            }
        }

        return minA > maxB;
    }

}
