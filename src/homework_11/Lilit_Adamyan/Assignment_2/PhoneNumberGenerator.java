package homework_11.Lilit_Adamyan.Assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber);

            }
        } catch (IOException e) {
            throw new IOException("An error occurred while writing to the file.", e);
        } finally {
            if (writer != null) {
                writer.close();
            }
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

