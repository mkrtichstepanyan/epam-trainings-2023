package homework_11.Radik_Manasyan.phoneNumbers;


import java.io.*;

public class GeneratePhoneNumbers {
    public static String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        String startNumber = "000000";

        for (int i = 0; i < numbers.length; i++) {
            String digit = Integer.toString(i);
            String newNumber = startNumber.substring(0, startNumber.length() - digit.length()) + digit;
            numbers[i] = code + newNumber;
        }
        return numbers;
    }

    public static void writeToFile(String[] phoneNumbers, String fileName) {

        try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < phoneNumbers.length; i++) {
                bufferedOutputStream.write(phoneNumbers[i] + "\n");
            }
            System.out.println("Recording process completed");

        } catch (IOException e) {
            System.out.println("Error during recording");
        }
    }
}
