/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

public class MatrixAddition {
    public static void main(String[] args) {
        // Define two 2D matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        if (matrixA.length != matrixB.length || matrixA[0].length != matrixB[0].length) {
            System.out.println("Matrices must be of the same size.");
            return;
        }
        int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];

        
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        
        System.out.println("Resultant Matrix:");
        for (int[] row : resultMatrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
   
