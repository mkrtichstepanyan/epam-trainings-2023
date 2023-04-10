package homework_11.araksya_ghazaryan;

import java.util.List;

public class Main {
    public static final String TOREADPATH = "/home/araksya/Rd_Epam/epam-trainings-2023/src/homework_11/araksya_ghazaryan/Reader.txt";
    public static void main(String[] args) {
        List<String> phoneNumbers = PhoneNumber.generatePhoneNumbers("093");
        PhoneNumber.WriteToFile(phoneNumbers,TOREADPATH);

        FileDemo.writeFile(TOREADPATH ,"Hello ");
        System.out.println(FileDemo.readFile(TOREADPATH));
        System.out.println(FileDemo.processData("Hello"));
    }
}