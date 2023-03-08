package homework_11.rafik_pahlevanyan.io_homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber : phoneNumbers) {
                bw.write(phoneNumber + "\n");
            }
        } catch (IOException e) {
            System.err.println("Can`t write into file");
            System.exit(1);
        }
    }
}
