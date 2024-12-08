package laba4;

public class Test4 {
    public static void main(String[] args) {
        int[][] triangle = new int[4][];
        triangle[0] = new int[]{1, 1, 1, 1};
        triangle[1] = new int[]{1, 1, 1};
        triangle[2] = new int[]{1, 1};
        triangle[3] = new int[]{1};
        for (int a = 0; a < triangle.length; a++) {
            for (int b = 0; b < triangle[a].length; b++) {
                System.out.print(" " + triangle[a][b] + "");
            }
            System.out.println();
        }
    }
}