// Задание 2
// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }

package homework;

import java.lang.ArithmeticException;

public class task2 {
    public static void main(String[] args) {

        // нужно задать int массив минимум 9 элементов.
        int[] intArray = { 0, 2, 42, 222, 2, 33, 18, 666, 1, 55 };
        // или нужно задать double массив целых чисел минимум 9 элементов.        
        double[] intArray1 = { 0, 2, 42, 222, 2, 33, 18, 666, 1, 55 };

        try {
            // int d = 0; но на 0 делить нельзя.
            int d = 3;
            // для вывода double разные варианты.
            double catchedRes2 = intArray1[8] / d;
            double catchedRes1 = (double)intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes2);
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}