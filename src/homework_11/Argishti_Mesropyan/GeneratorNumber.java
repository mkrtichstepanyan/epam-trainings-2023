package homework_11.Argishti_Mesropyan;

import java.io.IOException;

public class GeneratorNumber {
    public static void main(String[] args) {
        Generator generator = new Generator();
        String code = "093";
        String fileName = "src/homework_11/Argishti_Mesropyan/phoneNumber.txt";

        try {
            String[] phoneNumbers = generator.generatorPhoneNumber(code);
            for (String phoneNumber : phoneNumbers) {
                System.out.println(phoneNumber);
            }
            generator.writeToFile(phoneNumbers, fileName);
            System.out.println("Phone numbers are generated successfully  and also saved in phoneNumbers.txt ");
        } catch (IOException e) {
            System.out.println("error !!!" + e.getMessage());
        }
    }
}
