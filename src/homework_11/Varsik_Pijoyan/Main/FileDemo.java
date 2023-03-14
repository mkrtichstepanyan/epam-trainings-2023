package homework_11.Varsik_Pijoyan.Main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static homework_11.Varsik_Pijoyan.Assignment_1.Assignment_1.*;
import static homework_11.Varsik_Pijoyan.Assignment_2.Assignment_2.generatePhoneNumbers;

public class FileDemo {
    public static void main (String[] args) throws IOException {
        File file = new File(FILE);
        fileChecker(file);
        String data = readFile(FILE);
        String modifiedData = processData(data);
        writeFile(file.getName(), modifiedData);


        List<String> phoneNumbers = generatePhoneNumbers("093");
        String fileName = file.toString();
        writeFile(fileName, data);
    }




}
