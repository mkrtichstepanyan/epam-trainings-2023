package homework_12.Shushanik_araqelyan;

import java.util.ArrayList;
import java.util.List;

public class GeneratePhoneNumber {
    public static List<String> generatePhoneNumbers(String code) {
        List<String> phoneNumbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String number = String.valueOf(i);
            String zeros = "000000";
            String phoneNumber = code + zeros.substring(number.length()) + number;
            phoneNumbers.add(phoneNumber);
        }
        return phoneNumbers;
    }

}
