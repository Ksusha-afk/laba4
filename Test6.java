package laba4;
import java.util.Random;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {

        int rows = 4;
        int cols = 3;

        int[][] array = new int[rows][cols];

        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(" " + array[i][j] + "");
            }
            System.out.println();
        }

        int deleteRow = random.nextInt(rows);
        int deleteCol = random.nextInt(cols);

        int[][] array2 = new int[rows - 1][cols - 1];

        for (int i = 0, k = 0; i < rows; i++) {
            if (i == deleteRow) {
                continue;
            }
            for (int j = 0, l = 0; j < cols; j++) {
                if (j == deleteCol) {
                    continue;
                }
                array2[k][l] = array[i][j];
                l++;
            }
            k++;
        }
        System.out.println("Новый массив: ");

        for (int i = 0; i < rows - 1; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
    }
}
