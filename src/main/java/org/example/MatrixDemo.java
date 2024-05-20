package org.example;

import java.util.Scanner;

public class MatrixDemo {
    public static void MatrixFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements in the matrix: ");
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(int i =0; i < rows; i++){
            for(int j =0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
