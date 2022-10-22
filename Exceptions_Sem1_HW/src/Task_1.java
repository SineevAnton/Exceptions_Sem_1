// Задание 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.io.*;

public class Task_1 {

    public static String input(){
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            s = reader.readLine();
            if (s.equals("")){
                throw new RuntimeException("From method 'input()': String can not be empty Exception.");
            }
        } catch (IOException | RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return s;
    }

    public static void divideNumbers(int num1, int num2){
        String result = "";
        try {
            int res = num1/num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("From method 'divideNumbers()': Division by zero unsupported.");
        }
    }

    public static int getStrLength(String str){
        int result = -1; //Можем поставить -1, так как строка либо не существует, либо ее длина от 0 и больше
        try {
            result = str.length();
        } catch (NullPointerException e){
            System.out.println("NullPointerException from getStrLength().");
        } finally {
            return result;
        }
    }
}
