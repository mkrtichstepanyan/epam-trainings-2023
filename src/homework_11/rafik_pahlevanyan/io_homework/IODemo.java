package homework_11.rafik_pahlevanyan.io_homework;

import java.util.List;

public class IODemo {
    public static final String FILE_PAT = "/D:/javaexample/example.txt";
    public static void main(String[] args) {
        List<String> phoneNumbers = PhoneNumbersCreator.generatePhoneNumbers("093");
        PhoneNumbersCreator.WriteToFile(phoneNumbers, FILE_PAT);

        FileReadAndWrite.write(FILE_PAT, "hello");
        System.out.println(FileReadAndWrite.read(FILE_PAT));
        System.out.println(FileReadAndWrite.processData("hello"));
    }
}
