package homework_12.Radik_Manasyan.chapter22;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/homework_12\\test.txt");
        System.out.println("Имя файла: " + filePath.getName(1));
        System.out.println("Путь к файлу: " + filePath);
        System.out.println("Абсолютный путь к файлу: " + filePath.toAbsolutePath());
        System.out.println("Родительский каталог: " + filePath.getParent());

        if (Files.exists(filePath)) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Файл не существует");
        }

        try {
            if (Files.isHidden(filePath)) {
                System.out.println("Файл скрыт");
            } else {
                System.out.println("Файл не скрыт");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        Files.isReadable(filePath);
        System.out.println("Файл доступен для чтения");

        try {
            BasicFileAttributes attribs = Files.readAttributes(
                    filePath, BasicFileAttributes.class);
            if (attribs.isDirectory())
                System.out.println("Этo каталог");
            else
                System.out.println("Этo не каталог");
            if (attribs.isRegularFile())
                System.out.println("Этo обычный файл");
            else
                System.out.println("Этo не обычный файл");
            if (attribs.isSymbolicLink())
                System.out.println("Этo символическая ссылка");
            else
                System.out.println("Этo не символическая ссылка");

            System.out.println("Время последней модификации файла: " + attribs.lastModifiedTime());
            System.out.println("Размер файла: " + attribs.size());
        } catch (IOException e) {
            System.out.println("Ошибка чтения атрибутов: " + e);
        }
    }
}
