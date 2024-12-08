package laba4;

public class Test2 {
    public static void main(String[] args) {
        int triangle = 11;
        int a = triangle;
        while (a>=1) {
            int b =1;
            while (b<=a) {
                System.out.print(" *");
                b++;
            }
            System.out.println("");
            a--;
        }
        System.out.println("");
    }
}
