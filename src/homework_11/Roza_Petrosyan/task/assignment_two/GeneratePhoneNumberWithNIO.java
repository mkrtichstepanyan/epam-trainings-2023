package homework_11.Roza_Petrosyan.task.assignment_two;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GeneratePhoneNumberWithNIO {
    public String[] generatePhoneNumbers(String code) {
        String[] allNums = new String[1000000];
        for (int i = 0; i < allNums.length; i++) {
            allNums[i] = code + " " + String.format("%06d", i) + "\n";
        }
        return allNums;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) {
        try (FileChannel fileChannel = FileChannel.open(Path.of(fileName),
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE)) {
            for (String phoneNumber : phoneNumbers) {
                byte[] byteArray = phoneNumber.getBytes();
                ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
                fileChannel.write(byteBuffer);
            }
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
