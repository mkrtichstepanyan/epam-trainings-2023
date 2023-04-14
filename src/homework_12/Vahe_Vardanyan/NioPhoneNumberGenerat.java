package homework_12.Vahe_Vardanyan;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NioPhoneNumberGenerat {
    public static List<String> generatePhoneNumbers(String code){
        List<String> numbers = new ArrayList<>();
        if (!code.equals("093")){
            System.out.println("Code can only start is whit 093");
            System.exit(0);
        }
        for (int i = 0; i < 1000000; i++) {
            String phoneNumber = String.format("%s%06d", code, i);
            numbers.add(phoneNumber);
        }
        return numbers;
    }


    public static void writeToFile(List<String> phoneNumbers, String fileName){
        try {
            Path path = Paths.get(fileName);
            List<String> nums = new ArrayList<>();
            for (String phoneNumber: phoneNumbers) {
                nums.add(phoneNumber);
            }
            Files.write(path,nums, StandardCharsets.UTF_8);
        }catch (IOException e){
            System.err.println("An error occurred while writing to the file!");
        }
    }
}


