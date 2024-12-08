package laba4;
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = scanner.nextLine();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ключ: ");
        int shift = scanner.nextInt();

        String text1 = getEncryptString(text, shift);
        System.out.println("Текст после преобразования: " + text1);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("y")) {
            String text3 = getDecryptString(text1, shift);
            System.out.println("Текст после обратного преобразования: " + text3);
        } else if (choice.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ: ");
        }
        scanner.close();
    }

    public static String getEncryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }

        encryptString = new String(arrayCharNew);
        return encryptString;
    }

    public static String getDecryptString(String encryptString, int shift) {
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return encryptString;
    }
}