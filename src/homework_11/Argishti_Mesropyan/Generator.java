package homework_11.Argishti_Mesropyan;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Generator {
    public static String[] generatorPhoneNumber(String code) {
        String[] phoneNumbers = new String[1_000_000];


        for (int i = 0; i < 1_000_000; i++) {
            phoneNumbers[i] = String.format("%s%06d", code, i);
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
            throw new IOException("An ERROR occurred during file writing. ");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
}
