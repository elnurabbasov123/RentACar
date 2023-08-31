package util;

import enums.Exceptions;
import exeption.InputNotIntegerException;
import exeption.InputNotStringException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtil {
    public static String requiredText(String text) {
        System.out.print(text);
        Scanner sc =new Scanner(System.in);
        try{
            String ss=sc.next();
            return ss;
        }catch (InputMismatchException ex){
            throw new InputNotStringException(Exceptions.INPUT_NOT_STRING_EXCEPTION);
        }
    }

    public static int requiredNumber(String text) {
        System.out.print(text);
        Scanner sc =new Scanner(System.in);
        try{
            Integer ii=sc.nextInt();
            return ii;
        }catch (InputMismatchException ex){
            throw  new InputNotIntegerException(Exceptions.INPUT_NOT_INTEGER_EXCEPTION);

        }
    }
}
