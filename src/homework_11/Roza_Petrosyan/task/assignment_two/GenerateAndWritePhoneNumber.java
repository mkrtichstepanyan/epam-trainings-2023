package homework_11.Roza_Petrosyan.task.assignment_two;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateAndWritePhoneNumber {
    public String[] generatePhoneNumber(String code) {
        String numStr = "000000";
        String[] allNums = new String[1000000];

        int numInt = Integer.parseInt(numStr);
        allNums[0] = code + " " + String.format("%06d", numInt) + "\n";

        for (int i = 1; i < allNums.length; i++) {
            numInt++;
            allNums[i] = code + " " + String.format("%06d", numInt) + "\n";
        }

        return allNums;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) {

        try (BufferedWriter fw = new BufferedWriter(new FileWriter(fileName))) {

            for (String phoneNumber : phoneNumbers) {
                fw.write(phoneNumber);
            }

        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
