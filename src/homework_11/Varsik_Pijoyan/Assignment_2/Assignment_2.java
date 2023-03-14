package homework_11.Varsik_Pijoyan.Assignment_2;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Assignment_2 {
    public static List<String> generatePhoneNumbers(String code) {
        List<String> numbers = new ArrayList<>();
        if (!code.equals("093")) {
            System.out.println("Code can only start's with 093");
            System.exit(0);
        }
        String phoneNumber;
        for (int i = 0; i < 1000000; i++) {
            phoneNumber = String.format("%s%06d", code, i);
            numbers.add(phoneNumber);
        }
        return numbers;
    }

        public static void writeToFile(List<String> phoneNumbers, String fileName) {
            try {
                FileWriter writer = new FileWriter(fileName);
                for (String number : phoneNumbers) {
                    writer.write(number + "\n");
                }
                writer.close();
                System.out.println("Successfully wrote phone numbers to file.");
            } catch (IOException e) {
                System.out.println("Error writing phone numbers to file: " + e.getMessage());
                System.exit(1);
            }
        }

}
