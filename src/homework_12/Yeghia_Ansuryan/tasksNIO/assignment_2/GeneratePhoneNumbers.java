package homework_12.Yeghia_Ansuryan.tasksNIO.assignment_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GeneratePhoneNumbers {
    public String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = code + "  " + String.format("%06d", i) + "\n";
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
}
