package homework_11.Yeghia_Ansuryan.tasksIO.assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratePhoneNumbers {
    public String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + " " + String.format("%06d", i) + "\n";
        }
        return numbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber : phoneNumbers) {
                br.write(phoneNumber);
            }
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred: " + e.getMessage());
        }
    }
}

