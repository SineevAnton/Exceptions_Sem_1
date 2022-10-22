// Задание 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

public class Task_2 {
    public static int sum2d(String[][] arr){
        // В общем можно словить NullPointerException
        // Гипотетически... А вдруг массив ну ОООООООООчень большой... И получится словить OutOfMemoryException
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { //Тут можно словить IndexOutOfBoundsException (не обязательно ведь в массиве 5 колонок)
                int val = Integer.parseInt(arr[i][j]); // Тут можно словить ClassCastException (если попробуем, например, к инту скастовать 'asd')
                sum += val;
            }
        } return sum;
    }
}
