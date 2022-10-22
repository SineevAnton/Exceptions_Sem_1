import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String delimter = "____________________________________________";
        // Task 1 block
        // !!! Enter the empty string on program start.
        System.out.println("Just push Enter button. Do not type anything.");
        String s = Task_1.input();

        // Забавно! Если в методе "divideNumbers" тип данных поменять с int на double,
        // то исключение не сработает: в ответе получим бесконечность))
        Task_1.divideNumbers(10,0);

        String st = null;
        System.out.println(Task_1.getStrLength(st));
        // End of Task 1 block

        System.out.println(delimter + "\n" + delimter);

        // Task 2 block

        // Описал возможные исключения, которые увидел, в файле класса Task_2.

        // End of Task 2 block

        // Task 3 block

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr2zero = {1, 0, 3};
        int[] arr2wrongLength = {1, 2, 3, 4};

        Task_3.arrayDivision(arr1, arr2zero);
        Task_3.arrayDivision(arr1, arr2wrongLength);
        int[] result = Task_3.arrayDivision(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        // End of Task 3 block
    }
}