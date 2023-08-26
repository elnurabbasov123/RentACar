package util;

import java.util.Scanner;

public class InputUtil {
    public static String requiredText(String text) {
        System.out.print(text);
        Scanner sc =new Scanner(System.in);
        return  sc.next();
    }

    public static int requiredNumber(String text) {
        System.out.print(text);
        Scanner sc =new Scanner(System.in);
        return  sc.nextInt();
    }
}
