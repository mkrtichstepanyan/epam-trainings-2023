package homework_12.Vahe_Vardanyan;
import java.util.List;

import static homework_12.Vahe_Vardanyan.NioPhoneNumberGenerat.generatePhoneNumbers;
import static homework_12.Vahe_Vardanyan.NioPhoneNumberGenerat.writeToFile;


public class Main {
    public static void main(String[] args) {

        String readFile = "src\\homework_12\\Vahe_Vardanyan\\newNio.txt";
        String writeFile = "src\\homework_12\\Vahe_Vardanyan\\nio.txt";
        String phoneNumbersFile = "src\\homework_12\\Vahe_Vardanyan\\nioPhoneNumbers.txt";


        String date = NioFileProcessor.readFile(readFile);
        System.out.println(date);

        String processData = NioFileProcessor.processData(date);
        System.out.println(processData);
        NioFileProcessor.writeFile(writeFile,processData);

        List<String> phoneNumbers = generatePhoneNumbers("093");
        writeToFile(phoneNumbers, phoneNumbersFile);

    }
}
