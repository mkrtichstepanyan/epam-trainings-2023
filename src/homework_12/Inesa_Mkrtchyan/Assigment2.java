package homework_12.Inesa_Mkrtchyan;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Assigment2 {
    public static void main(String[] args) {
        String File = "src\\homework_12\\Inesa_Mkrtchyan\\PhoneNumbers.txt";
        writeToFile(generatePhoneNumbers("093"),File);
    }

    public static void writeToFile(List<String> phoneNumbers, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (String phoneNumber : phoneNumbers) {
                writer.write(phoneNumber + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Error");
            System.exit(1);
        }
    }

    public static List<String> generatePhoneNumbers(String code){
        List<String> phoneNumbers = new ArrayList<>();

        for(int i = 0; i <= 999999; i++){
            StringBuilder sb = new StringBuilder();
            if(i < 10 && i > 0){
                sb.append(code + "00000" + i);
            }
            if(i < 100 && i >= 10){
                sb.append(code + "0000" + i);
            }
            if(i < 1000 && i >= 100){
                sb.append(code + "000" + i);
            }
            if(i < 10000 && i >= 1000){
                sb.append(code + "00" + i);
            }
            if(i < 100000 && i >=10000){
                sb.append(code + "0" + i);
            }
            if(i >= 100000){
                sb.append(code + i);
            }
            phoneNumbers.add(sb.toString());
        }
        return phoneNumbers;
    }

}
