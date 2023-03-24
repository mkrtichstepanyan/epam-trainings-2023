package homework_11.Zara_Avetyan.assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratePhoneNumbers {
    public String[] generatePhoneNumbers(String code){
        String[] phoneNumbers = new String[1000000];
        for (int i=0; i<1000000; i++){
            phoneNumbers[i] = code+String.format("%06d\n", i);
        }
        return phoneNumbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String phoneNumber: phoneNumbers){
                writer.write(phoneNumber);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
