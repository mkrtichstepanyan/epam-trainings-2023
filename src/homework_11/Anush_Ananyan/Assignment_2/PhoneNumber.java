package homework_11.Anush_Ananyan.Assignment_2;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PhoneNumber {
    public String[] generatePhoneNumbers(String code) {
        String[] phoneNumbers = new String[1000000];
        String phoneNumber;
        for (int i = 0; i < 1000000; i++) {
            phoneNumber = code + String.format("%06d", i) +"\n";
            phoneNumbers[i] = phoneNumber;
        }
        return phoneNumbers;
    }

    public void writeFile(String[] phoneNumbers, String fileName) {
        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber : phoneNumbers) {
                writeFile.write(phoneNumber);
            }
        } catch (IOException e) {
            System.out.println("Error writing phone numbers");
        }

    }
}
