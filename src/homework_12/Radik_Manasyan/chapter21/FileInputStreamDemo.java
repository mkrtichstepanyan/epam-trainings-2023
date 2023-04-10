package homework_12.Radik_Manasyan.chapter21;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try (FileInputStream f =
                     new FileInputStream("/home/radik/IdeaProjects/epam-trainings-2023/" +
                             "src/homework_12/Radik_Manasyan/chapter21/FileInputStreamDemo.java")) {
            System.out.println("Total count of available bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("Первые " + n + " байтов, " +
                    "прочитанных из файла по очереди методом read()");
            System.out.println("\nВсе еще не доступно: " + n +
                    " байтов по очереди методом read(b[])");
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.out.println("Нельзя прочитать " + n + " байтов.");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nВсе еще не доступно: " +
                    (size = f.available()));

            System.out.println("Пропустить палавину оставшихся байтов методам skip()");
            f.skip(size / 2);
            System.out.println("\nВсе еще не доступно: " + f.available());
            System.out.println("Чтение " + n / 2 + "байтовб размещаемых в конце массива");

            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.out.println("Нельзя прочитать " + n / 2 + " байтов.");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсе еще не доступно: " + f.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
