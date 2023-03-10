package homework_11.gevorg_arghushyan.tasck_2;


import java.io.FileWriter;
import java.io.IOException;

public class WritePhoneNumbersToFile {

    private static final String PHONE_NUMBER = "src/homework_11/gevorg_arghushyan/tasck_2/phone_numbers.txt";

    public static void main(String[] args) {


        String[] phoneNumbers = generatePhoneNumbers();

        try (FileWriter writer = new FileWriter(PHONE_NUMBER)) {
            for (String number : phoneNumbers) {
                writer.write(number + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("This method trow exception");
        }
    }

    public static String[] generatePhoneNumbers() {
        String[] phoneNumbers = new String[1000000];
        for (int i = 0; i < 1000000; i++) {
            String number = "077" + String.format("%06d", i);
            phoneNumbers[i] = number;
        }
        return phoneNumbers;
    }
}