package homework_11.ofelya_khachatryan;

import java.io.IOException;

public class GeneratorDemo {
    public static void main(String[] args) {

        Generator generate = new Generator();
        String code = "093";
        String fileName = "src/homework_11/ofelya_khachatryan/phoneNumbers.txt";

        try {
            String[] phoneNumbers = generate.generatePhoneNumber(code);
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
            generate.writeToFile(phoneNumbers, fileName);
            System.out.println("Phone numbers are generated successfully and also saved in phoneNumbers.txt");
        } catch (IOException e) {
            System.out.println("ERROR! " + e.getMessage());
        }
    }
}
