package homework_11.gohar_hakobyan;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static homework_11.gohar_hakobyan.FileUtil.*;
import static homework_11.gohar_hakobyan.PhoneNumberGenerator.generatePhoneNumbers;
import static homework_11.gohar_hakobyan.PhoneNumberGenerator.writeToFile;

public class FileProcessor {
    public static void main(String[] args) throws IOException {

        File file = new File(FILE_PATH);
        fileChecker(file);
        String data = readFile(FILE_PATH);
        String modifiedData = processData(data);
        writeFile(file.getName(), modifiedData);


        List<String> phoneNumbers = generatePhoneNumbers("093");
        String fileName = file.toString();
        writeToFile(phoneNumbers, fileName);


    }

}
