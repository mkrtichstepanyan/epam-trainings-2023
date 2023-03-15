package homework_12.robert_nazaryan;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumber {
    String[] phoneNumbers = new String[1_000_000];

    public String[] generatePhoneNumbers(String code) {
        NumberFormat numberFormat = new DecimalFormat("000000");

        for (int i = 0; i < phoneNumbers.length; i++) {
            phoneNumbers[i] = code + numberFormat.format(i);
        }
        return phoneNumbers;
    }

    public void writeToFile(String fileName) {
        try {
            Path path = Paths.get(fileName);
            List<String> list = new ArrayList<>(Arrays.asList(phoneNumbers));
            Files.write(path, list, StandardCharsets.UTF_8);
        } catch (FileNotFoundException e) {
            System.out.println(fileName + ": not found");
        } catch (IOException e) {
            System.out.println("Cant't write in this file");
        }
        ;
    }
}
