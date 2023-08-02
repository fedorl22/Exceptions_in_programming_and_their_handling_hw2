package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
    public static void main(String[] args) {
        boolean arg = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (arg) {
            System.out.print("Введите дробь с плавающей запятой(типа float): ");
            try {
                float Num = Float.parseFloat(reader.readLine());
                System.out.printf("Введенное число равно %f\n", Num);
                arg = false;
            } catch (IOException | NumberFormatException e) {
                System.out.println("Некорректный ввод. Введите дробь с плавающей запятой (типа float).");
            }

        }
    }
}


    