package homework_11.Diana_Melkonyan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static String path = "C:\\Users\\37455\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\Diana_Melkonyan\\readFile.txt";
    public static void main(String[] args) {
        List<String> phoneNumber=PhoneNumber.generatePhoneNumbers("093");
        PhoneNumber.writeToFile(phoneNumber,path);
    }
    public static List<String> generatePhoneNumbers(String code){
List<String> phoneNumbers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            String firstNumber="000000";
            String number = String.valueOf(i);
            String phoneNum= code + firstNumber.substring(number.length()) + number;
            phoneNumbers.add(phoneNum + "\n");
        }

        return phoneNumbers;
    }
    public static void writeToFile(List<String> phoneNumbers, String fileName){
        try(BufferedWriter wr = new BufferedWriter(new FileWriter(fileName))){
            for (String phoneNumber:phoneNumbers) {
                wr.write(phoneNumber);
            }
        }catch (IOException e){
            System.out.println( "Unable to register this phone number");
        }
    }
}
