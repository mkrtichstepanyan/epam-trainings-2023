package homework_11.Diana_Melkonyan;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        String readFile = "src\\homework_11\\Diana_Melkonyan\\readFile.txt";
        String writeFile = "src\\homework_11\\Diana_Melkonyan\\writeFile.txt";
        String phoneFile = "src\\homework_11\\Diana_Melkonyan\\phoneFile.txt";


        String data = Process.readFile(readFile);
        System.out.println(data);

        String processData = Process.processData(data);
        System.out.println(processData);

        Process.writeFile(writeFile,processData);

        List<String> phoneNumber = PhoneNumber.generatePhoneNumbers("093");
        PhoneNumber.writeToFile(phoneNumber, phoneFile);

    }
}

