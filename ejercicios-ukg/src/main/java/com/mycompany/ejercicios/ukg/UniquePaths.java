/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios.ukg;

/**
 *
 * @author fabian.grobert
 */
public class UniquePaths {

    public long uniquePaths(int m, int n) {
        long[][] dp = new long[m][n];

        // Initialize the first row and first column to 1 since there is only one path to reach each cell
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        // Calculate the number of unique paths for each cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // Return the number of unique paths to reach the bottom right cell
        return dp[m - 1][n - 1];
    }

    public long uniquePaths2(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);

    }

}
