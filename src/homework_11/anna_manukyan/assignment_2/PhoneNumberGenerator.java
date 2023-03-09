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
        int i = 0;
        while (i < 10) {
            tmpNumber = code + "00000" + i;
            phoneNumbers.add(tmpNumber);
            i++;
        }
        ;
        while (i >= 10 && i < 100) {
            tmpNumber = code + "0000" + i;
            phoneNumbers.add(tmpNumber);
            i++;
        }
        while (i >= 100 && i < 1000) {
            tmpNumber = code + "000" + i;
            phoneNumbers.add(tmpNumber);
            i++;
        }
        while (i >= 1000 && i < 10000) {
            tmpNumber = code + "00" + i;
            phoneNumbers.add(tmpNumber);
            i++;
        }
        while (i >= 10000 && i < 100000) {
            tmpNumber = code + "0" + i;
            phoneNumbers.add(tmpNumber);
            i++;
        }
        while (i >= 100000 && i < 1000000) {
            tmpNumber = code + i;
            phoneNumbers.add(tmpNumber);
            i++;
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
