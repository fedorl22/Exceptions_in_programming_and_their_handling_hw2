// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст, кроме пустой строки");
        try {
            String res = reader.readLine();
            if (res.equals(""))
                throw new RuntimeException("Введены некорректные данные, пустую строку вводить нельзя");

            System.out.println(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}