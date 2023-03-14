package homework_11.Radik_Manasyan.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];

        System.out.println("Введите строки текста. \nВведите stop для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i] = bf.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("Содержимое вашего файла.");
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
