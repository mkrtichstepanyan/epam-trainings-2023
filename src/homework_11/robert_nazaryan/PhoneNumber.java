package homework_11.robert_nazaryan;

import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PhoneNumber {
    String[] phoneNumbers = new String[1_000_000];

    public String[] generatePhoneNumbers(String code) {
        NumberFormat numberFormat = new DecimalFormat("000000");

        for (int i = 0; i < phoneNumbers.length; i++) {
            phoneNumbers[i] = code + numberFormat.format(i);
        }
        return phoneNumbers;
    }

    public void writeToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber);
                writer.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName + ": not found");
        } catch (IOException e) {
            System.out.println("Cant't write in this file");
        }
        ;
    }
}
