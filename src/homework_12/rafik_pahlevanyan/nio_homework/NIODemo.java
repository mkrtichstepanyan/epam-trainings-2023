package homework_12.rafik_pahlevanyan.nio_homework;

import homework_11.rafik_pahlevanyan.io_homework.FileReadAndWrite;
import homework_11.rafik_pahlevanyan.io_homework.PhoneNumbersCreator;

import java.util.List;

public class NIODemo {
    public static final String FILE_PATH = "/D:/javaexample/example.txt";

    public static void main(String[] args) {
        List<String> phoneNumbers = PhoneNumbersCreator.generatePhoneNumbers("093");
        PhoneNumbersCreator.WriteToFile(phoneNumbers, FILE_PATH);

        FileReadAndWrite.write(FILE_PATH, "hello");
        System.out.println(FileReadAndWrite.read(FILE_PATH));
        System.out.println(FileReadAndWrite.processData("hello"));
    }
}
