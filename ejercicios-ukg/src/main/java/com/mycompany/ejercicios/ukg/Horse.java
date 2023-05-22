/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

/**
 *
 * @author fabian.grobert
 */
public class Horse {

   public static int minMoves(int startX, int startY) {
    int[][] visited = new int[8][8];
    int[] xMoves = { 2, 1, -1, -2, -2, -1, 1, 2 };
    int[] yMoves = { 1, 2, 2, 1, -1, -2, -2, -1 };
    visited[startX][startY] = 1;
    return backtrack(startX, startY, visited, xMoves, yMoves, 1);
}

public static boolean isValidMove(int x, int y, int[][] visited) {
    return (x >= 0 && x < 8 && y >= 0 && y < 8 && visited[x][y] == 0);
}

public static int backtrack(int x, int y, int[][] visited, int[] xMoves, int[] yMoves, int count) {
    if (count == 64) {
        return count;
    }
    int minMoves = Integer.MAX_VALUE;
    for (int i = 0; i < 8; i++) {
        int nextX = x + xMoves[i];
        int nextY = y + yMoves[i];
        if (isValidMove(nextX, nextY, visited)) {
            visited[nextX][nextY] = 1;
            int moves = backtrack(nextX, nextY, visited, xMoves, yMoves, count + 1);
            if (moves > 0 && moves < minMoves) {
                minMoves = moves;
            }
            visited[nextX][nextY] = 0;
        }
    }
    return minMoves;
}

}
