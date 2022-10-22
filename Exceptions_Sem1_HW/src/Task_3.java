// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
// RuntimeException, т.е. ваше

public class Task_3 {
    public static int[] arrayDivision(int[] arr1, int[] arr2) {
        int[] result = new int[0];
        try {
            result = new int[arr1.length];
            if (arr1.length != arr2.length) {
                throw new RuntimeException("Array lengths are not equal.");
            } else {
                for (int i = 0; i < arr1.length; i++) {
                    if (arr2[i] == 0) {
                        throw new RuntimeException("Division by zero is unsupported.");
                    } else {
                        result[i] = arr1[i] / arr2[i];
                    }
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
