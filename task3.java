// Задание 3

// public static void main(String[] args) throws Exception {
//    try {
//        int a = 90;
//        int b = 3;
//        System.out.println(a / b);
//        printSum(23, 234);
//        int[] abc = { 1, 2 };
//        abc[3] = 9;
//    } catch (Throwable ex) {
//        System.out.println("Что-то пошло не так...");
//    } catch (NullPointerException ex) {
//        System.out.println("Указатель не может указывать на null!");
//    } catch (IndexOutOfBoundsException ex) {
//        System.out.println("Массив выходит за пределы своего размера!");
//    }
// }
// public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//    System.out.println(a + b);
// }

import java.util.Arrays;

public class task3 {

    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);

            System.out.println();
            // int[] abc = { 1, 2 };
            // массив нужно минимум 4 элемента, "abc[3] = 9;" - запрос к 3-му элементу.
            int[] abc1 = { 1, 2, 22, 11, 33 };
            // заменили 4 элемент, для проверки печатаем массив.            
            abc1[3] = 9;
            System.out.println(Arrays.toString(abc1));
            // или как в условии, тогда будет ошибка "Массив выходит за пределы своего размера!"
            int[] abc = { 1, 2 };
            abc[3] = 9;
      
            // } catch (Throwable ex) {
            // System.out.println("Что-то пошло не так...");
            // } catch (NullPointerException ex) {
            // System.out.println("Указатель не может указывать на null!");
            // } catch (IndexOutOfBoundsException ex) {
            // System.out.println("Массив выходит за пределы своего размера!");
            // не верная иерархия.

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // public static void printSum(Integer a, Integer b) throws
    // FileNotFoundException {
    // Указано не верное FileNotFoundException, нужно ArithmeticException
    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }
}
