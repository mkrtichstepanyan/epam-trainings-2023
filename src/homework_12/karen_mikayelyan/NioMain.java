package homework_12.karen_mikayelyan;


import java.util.List;

import static homework_12.karen_mikayelyan.NioPhoneNumberGenerator.generatePhoneNumbers;
import static homework_12.karen_mikayelyan.NioPhoneNumberGenerator.writeToFile;


public class NioMain {


    public static void main(String[] args) {



        String readFile = "src\\homework_12\\karen_mikayelyan\\newNio.txt";
        String writeFile = "src\\homework_12\\karen_mikayelyan\\nio.txt";
        String phoneNumbersFile = "src\\homework_12\\karen_mikayelyan\\NioPhoneNumbers.txt";


        String data = NioFileProcessor.readFile(readFile);
        System.out.println(data);

        String processData = NioFileProcessor.processData(data);
        System.out.println(processData);

        NioFileProcessor.writeFile(writeFile, processData);

        List<String> phoneNumbers = generatePhoneNumbers("093");
        writeToFile(phoneNumbers, phoneNumbersFile);
    }
}
