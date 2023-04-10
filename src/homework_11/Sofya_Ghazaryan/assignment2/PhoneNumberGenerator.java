package homework_11.Sofya_Ghazaryan.assignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class PhoneNumberGenerator {

    public static String[] generatePhoneNumbers(String code) {
        String firstNumber = "000000";
        String[] numbers = new String[1_000_000];

        String firstNumberString = code + firstNumber;
        int firstNumberInt = Integer.parseInt(firstNumberString);

        if (Integer.parseInt(code.charAt(0) + "") == 0) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = "0" + firstNumberInt;
                firstNumberInt = firstNumberInt + 1;
            }
        } else {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = "" + firstNumberInt;
                firstNumberInt = firstNumberInt + 1;
            }
        }
        return numbers;
    }

    public static void writeInFile(String[] phoneNumber, String fileName) {
        File file = new File(fileName);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(Arrays.toString(phoneNumber));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
