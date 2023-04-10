package homework_11.Liana_Gevorgyan.assignment_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String[] resultNumbers = PhoneNumberGenerator.generatePhoneNumbers("093");
        try {
            PhoneNumberGenerator.writeToFile(resultNumbers);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
