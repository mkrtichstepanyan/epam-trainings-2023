package homework_12.Varsik_Pijoyan.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Assignment2 {
    public String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + String.format("%06d", i) + "\n";
        }
        return numbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) {
        try (FileChannel fileChannel = FileChannel.open(Path.of(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String phoneNumber : phoneNumbers) {
                byte[] byteArray = phoneNumber.getBytes();
                ByteBuffer bf = ByteBuffer.wrap(byteArray);
                fileChannel.write(bf);
            }
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        String fileName = "src/homework_12/Varsik_Pijoyan/NIO/file/phoneNumber.txt";

        Assignment2 phoneNumbers1 = new Assignment2();
        String[] phoneNumbers2 = phoneNumbers1.generatePhoneNumbers("093");
        phoneNumbers1.writeToFile(phoneNumbers2, fileName);
    }

}
