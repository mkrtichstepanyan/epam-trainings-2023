package homework_12.Radik_Manasyan.chapter21;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/home/radik/IdeaProjects/epam-trainings-2023/src/homework_12/Radik_Manasyan/chapter21/FileReaderDemo.java")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
