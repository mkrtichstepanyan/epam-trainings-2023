package homework_11.Liana_Gevorgyan.assignment_2;

import java.io.FileWriter;
import java.io.IOException;

public class PhoneNumberGenerator {

    static final String relativePath = "./src/homework_11/Liana_Gevorgyan/assignment_2/phoneNumbers.txt";

    public static String[] generatePhoneNumbers(String code) {
        String[] phoneNumbers = new String[1000000];
        int baseNumber = Integer.parseInt(code)* 1000000;
        for (int i = 0; i<1000000; i++) {
            phoneNumbers[i] = "0" + (baseNumber + i);
        }

        return phoneNumbers;

    }

    public static void writeToFile(String[] phoneNumbers) throws IOException {
        FileWriter fw = new FileWriter(relativePath);
        for (String number : phoneNumbers) {
            fw.write(number + "\n");
        }
        fw.close();
    }
}
