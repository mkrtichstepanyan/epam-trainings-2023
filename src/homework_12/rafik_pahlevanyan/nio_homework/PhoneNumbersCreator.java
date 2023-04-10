package homework_12.rafik_pahlevanyan.nio_homework;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumbersCreator {
    public static List<String> generatePhoneNumbers(String code) {
        List<String> phoneNumbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String number = String.valueOf(i);
            String zeros = "000000";
            String phoneNumber = code + zeros.substring(number.length()) + number;
            phoneNumbers.add(phoneNumber);
        }
        return phoneNumbers;
    }

    public static void WriteToFile(List<String> phoneNumbers, String fileName) {
        try {
            Path path = Paths.get(fileName);
            List<String> lines = new ArrayList<>();
            for (String phoneNumber : phoneNumbers) {
                lines.add(phoneNumber);
            }

            Files.write(path, lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Can't write into file");
            System.exit(1);
        }
    }
}
