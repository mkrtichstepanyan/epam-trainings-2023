package homework_11.TatevKocharyan.homework.assignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class PhoneNumberGenerator {


    public static String[] generatePhoneNumbers(String code) {
        String zeros = "000000";
        String[] numbers = new String[1000000];
        String number;
        String finalnumber;
        for (int i = 0; i<1000000; i++) {
            number = String.valueOf(i);
            finalnumber = code + zeros.substring(number.length())+number;
            numbers[i] = finalnumber;

        }

        return numbers;

    }

   public static void writeToFile(String [] phoneNumbers, String fileName){
       File file = new File(fileName);
       try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
           bufferedWriter.write(Arrays.toString(phoneNumbers));
       } catch (IOException e) {
           e.getMessage();
       }

   }


   }









