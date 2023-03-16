package homework_12.Lilit_Adamyan.Nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PhoneNumberGenerator {
    public static String[] generatePhoneNumbers(String code) {
        String[] phoneNumbers = new String[1000000];
        String phoneNumber;

        for (int i = 0; i < 1000000; i++) {
            phoneNumber = String.format("%s%06d", code, i);
            phoneNumbers[i] = phoneNumber;
        }
        return phoneNumbers;
    }

    public static void writeToFile(String[] phoneNumbers, String fileName) throws IOException {
        Path path = Paths.get(fileName);
        try
            (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)){

            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber);
                writer.newLine();

            }
        } catch (IOException e) {
            throw new IOException("An error occurred while writing to the file.", e);
        }

    }
    public static void main(String[] args) {
        String code = "093";
        String fileName = "phoneNumbers.txt";

        try {
            String[] phoneNumbers = generatePhoneNumbers(code);
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
            writeToFile(phoneNumbers, fileName);
            System.out.println("Phone numbers successfully generated and saved to phoneNumbers.txt.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(0);
        }
    }
}
