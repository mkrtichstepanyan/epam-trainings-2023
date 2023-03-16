package homework_11.Karen_Sargsyan.assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    String filePath = "src/homework_11/Karen_Sargsyan/assignment_2/";
    BufferedWriter writer;

    public String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        int incrementAbleNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + String.format("%06d", incrementAbleNumber) + "\n";
            incrementAbleNumber++;
        }
        return numbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) {
        try {
            writer = new BufferedWriter(new FileWriter(filePath.concat(fileName)));
            for (String perNumber : phoneNumbers) {
                if (perNumber != null) {
                    writer.write(perNumber);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
