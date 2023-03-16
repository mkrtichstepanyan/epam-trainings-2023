package homework_12.anna_manukyan.assignment_2_using_NIO;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String code = "093";
        PhoneNumberGenerator phoneNumberGenerator = new PhoneNumberGenerator();
        List<String> strings = phoneNumberGenerator.generatePhoneNumbers(code);
        phoneNumberGenerator.writeToFile(strings, "Phone Numbers.txt");
    }
}
