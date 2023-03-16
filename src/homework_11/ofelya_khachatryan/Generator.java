package homework_11.ofelya_khachatryan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Generator {
    public static String[] generatePhoneNumber(String code) {
        String[] phoneNumbers = new String[1000000];
        String phoneNumber;

        for (int i = 0; i < 1000000; i++) {
            phoneNumber = String.format("%s%06d", code, i);
            phoneNumbers[i] = phoneNumber;
        }
        return phoneNumbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber);
            }
        } catch (IOException e) {
            throw new IOException("An ERROR occurred during file writing.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
