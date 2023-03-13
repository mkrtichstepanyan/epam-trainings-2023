package homework_11.karen_mikayelyan;

import java.util.List;

import static homework_11.karen_mikayelyan.PhoneNumbersGenerator.generatePhoneNumbers;
import static homework_11.karen_mikayelyan.PhoneNumbersGenerator.writeToFile;

public class Main {

    public static void main(String[] args) {

        String readFile = "src\\homework_11\\karen_mikayelyan\\readFile";
        String writeFile = "src\\homework_11\\karen_mikayelyan\\writeFile.txt";
        String phoneNumbersFile = "src\\homework_11\\karen_mikayelyan\\phoneNumbersFile.txt";


        String data = FileProcessor.readFile(readFile);
        System.out.println(data);

        String processData = FileProcessor.processData(data);
        System.out.println(processData);

        FileProcessor.writeFile(writeFile, processData);

        List<String> phoneNumbers = generatePhoneNumbers("093");
        writeToFile(phoneNumbers, phoneNumbersFile);

    }
}
