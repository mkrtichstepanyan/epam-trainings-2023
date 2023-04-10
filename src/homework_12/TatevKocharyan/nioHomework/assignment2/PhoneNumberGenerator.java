package homework_12.TatevKocharyan.nioHomework.assignment2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
        String number="";
       for (int i = 0; i <phoneNumbers.length ; i++) {
           number=phoneNumbers[i];
       }
       ByteBuffer buffer = ByteBuffer.wrap(number.getBytes());
       try (FileChannel channel = FileChannel.open(Paths.get(fileName),
               StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
           channel.write(buffer);
       } catch (IOException e) {
           e.printStackTrace();
       }

   }


   }









