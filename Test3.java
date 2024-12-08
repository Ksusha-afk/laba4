package laba4;

public class Test3 {
    public static void main(String[] args) {
        int [][] rectangle = {{2,2,2},{2,2,2,2}};
        for (int a = 0; a <2; a++) {
            for (int b = 0; b<3; b++) {
                System.out.print(" "+rectangle[a][b]+ "");
            }
            System.out.println();
        }
    }
}
