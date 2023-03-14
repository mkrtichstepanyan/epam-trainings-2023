package homework_12.Alina_Mkhoyan.nio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumbersGenerator {

    public static void main(String[] args) {
        List<String> phoneNumbers = generatePhoneNumbers("093");
        writeToFile(phoneNumbers, "src\\homework_12\\Alina_Mkhoyan\\nio\\phoneNumbers.txt");
    }

    public static List<String> generatePhoneNumbers(String code) {
        List<String> phoneNumbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String phoneNumber = String.format("%s%06d", code, i);
            phoneNumbers.add(phoneNumber);
        }
        return phoneNumbers;
    }

    public static void writeToFile(List<String> phoneNumbers, String fileName) {
        try {
            Files.write(Paths.get(fileName), phoneNumbers, StandardCharsets.UTF_8);
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
            System.exit(1);
        }
    }
}