package homework_12.Vladimir_Vanyan;

import java.util.List;

public class Main {
    public static String TOREDPATH = "C:\\Users\\Zmix\\Desktop\\epam-trainings-2023\\src\\homework_12\\Vladimir_Vanyan\\Reader.txt";

    public static void main(String[] args) {
        List<String> phoneNumbers = PhoneNumber.generatePhoneNumbers("093");
        PhoneNumber.WriteToFile(phoneNumbers, TOREDPATH);

        FileReadAndWrite.writeFile(TOREDPATH, "Hello ");
        System.out.println(FileReadAndWrite.readFile(TOREDPATH));
        System.out.println(FileReadAndWrite.processData("Hello"));

    }
}
