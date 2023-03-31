package homework_12.Davit_Poghosyan.Assignment_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class PhoneNumberGenerate_NIO {
    public static String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1_000_000];
        NumberFormat format = new DecimalFormat("000000");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + format.format(i);
        }
        return numbers;

    }

    public static void writePhoneNumbers(String[] numbers, String fileName) {
        try {
            FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE);
            channel.write(getByByte(numbers));
        } catch (IOException e) {
            System.out.println("I/O error" + e);
        }
    }
    public static ByteBuffer[] getByByte(String[] numbers){
        ByteBuffer[] bytearray =new ByteBuffer[numbers.length];
        for(int i =0; i< numbers.length; i++){
            bytearray[i] = ByteBuffer.wrap((numbers[i]+"\n").getBytes());
        }
        return bytearray;
    }



    public static void main(String[] args) {
        String[] numbers = generatePhoneNumbers("094");
        String fileName = "src/homework_12/Davit_Poghosyan/Assignment_2/Phonenumbers.txt";
        writePhoneNumbers(numbers, fileName);
    }
}
