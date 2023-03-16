package homework_12.gohar_hakobyan.assignment;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static homework_12.gohar_hakobyan.assignment.FileUtil.*;
import static homework_12.gohar_hakobyan.assignment.PhoneNumberGenerator.generatePhoneNumbers;
import static homework_12.gohar_hakobyan.assignment.PhoneNumberGenerator.writeToFile;

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
