package laba4;
import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        int c = 3;
        int l = 5;
        int[][] array = new int[c][l];
        Random random = new Random();
        for (int i = 0; i<c; i++) {
            for (int j = 0; j < l; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(" " + array[i][j] + "");
            }
            System.out.println();
        }
        for (int i = 0; i<l; i++) {
            for (int j = i; j < c; j++) {
                int array2 = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = array2;
            }
        }
        System.out.println();
        for (int i = 0; i<l; i++){
            for (int j=0; j<c; j++){
                System.out.print(" " + array[j][i] + "");
            }
            System.out.println();
        }
    }
}