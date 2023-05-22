/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

/**
 *
 * @author fabian.grobert
 */
public class ValidMoveKnight {

    public static boolean isValidKnightMove(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        // Check if the new coordinates are within the chessboard boundaries (8x8 board)
        if (x2 < 0 || x2 >= 8 || y2 < 0 || y2 >= 8) {
            return false;
        }

        return (dx == 1 && dy == 2) || (dx == 2 && dy == 1);
    }
}
