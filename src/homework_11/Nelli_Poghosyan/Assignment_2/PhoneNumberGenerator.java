package homework_11.Nelli_Poghosyan.Assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PhoneNumberGenerator {

    public static String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1_000_000];
        NumberFormat format = new DecimalFormat("000000");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + format.format(i);
        }
        return numbers;

    }

    public static void writePhoneNumbers(String[] numbers, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (String number : numbers) {
                bufferedWriter.write(number);
                bufferedWriter.write("\n");
            }
        } catch (IOException e) {
            System.out.println("I/O error" + e);
        }
    }

    public static void main(String[] args) {
        String[] numbers = generatePhoneNumbers("094");
        String fileName = "epam-trainings-2023/src/homework_11/Nelli_Poghosyan/Assignment_2/PhoneNumber.txt";
        writePhoneNumbers(numbers, fileName);
    }
}
