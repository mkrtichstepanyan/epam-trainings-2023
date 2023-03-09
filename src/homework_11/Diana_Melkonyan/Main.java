package homework_11.Diana_Melkonyan;

import java.util.List;

public class Main extends Process {
    public static final String PATH = "C:\\Users\\37455\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\Diana_Melkonyan\\readFile.txt";

    public static void main(String[] args) {
        Process.writeFile(PATH, "Diana");
        System.out.println(Process.readFile(PATH));
        System.out.println(Process.processData("Diana"));

        List<String> phoneNumber=PhoneNumber.generatePhoneNumbers("093");
        PhoneNumber.writeToFile(phoneNumber,PATH);
    }
}

