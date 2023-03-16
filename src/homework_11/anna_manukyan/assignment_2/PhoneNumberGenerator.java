package homework_11.anna_manukyan.assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberGenerator {
    private static final String BASE_PATH = "src\\homework_11\\anna_manukyan\\assignment_2\\";
    private List<String> phoneNumbers = new ArrayList<>();

    public List<String> generatePhoneNumbers(String code) {
        String tmpNumber = "";
        for (int i = 0; i < 1000000; i++) {
            tmpNumber = code + String.format("%06d", i);
            phoneNumbers.add(tmpNumber);
        }
        return phoneNumbers;
    }

    public void writeToFile(List<String> phoneNumbers, String fileName) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(BASE_PATH + fileName))) {
            bufferedWriter.write(String.valueOf(phoneNumbers));
            System.out.println("Phone Numbers list was created successfully!");
        } catch (IOException e) {
            System.out.println("Can not write phoneNumbers in " + fileName + " name");
        }
    }
}
