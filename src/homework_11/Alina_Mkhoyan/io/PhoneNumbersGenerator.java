package homework_11.Alina_Mkhoyan.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumbersGenerator {

    private static final String CODE = "093";
    private static final int MAX_DIGITS = 6;

    public static void main(String[] args) {
        List<String> phoneNumbers = generatePhoneNumbers(CODE, MAX_DIGITS);
        String fileName = "src\\homework_11\\Alina_Mkhoyan\\io\\phoneNumbers.txt";
        writeToFile(phoneNumbers, fileName);
    }

    private static List<String> generatePhoneNumbers(String code, int maxDigits) {
        List<String> phoneNumbers = new ArrayList<>();
        for (int i = 0; i < Math.pow(10, maxDigits); i++) {
            String phoneNumber = code + String.format("%0" + maxDigits + "d", i);
            phoneNumbers.add(phoneNumber);
        }
        return phoneNumbers;
    }

    private static void writeToFile(List<String> phoneNumbers, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}