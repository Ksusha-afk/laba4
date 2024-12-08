package laba4;

import java.util.Random;

public class Test7 {
    public static void main(String[] args) {
        int n = 5;

        int[][] array = new int[n][n];

        int size = 1;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = n - 1;

        while (size <= n * n) {
            for (int i = startRow; i <= endRow; i++) {
                array[startRow][i] = size++;
            }

            for (int i = startRow + 1; i <= endCol; i++) {
                array[i][endCol] = size++;
            }

            for (int i = endCol - 1; i >= startCol; i--) {
                array[endCol][i] = size++;
            }

            for (int i = endCol - 1; i >= startCol + 1; i--) {
                array[i][startCol] = size++;
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        System.out.println("Змейка:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
