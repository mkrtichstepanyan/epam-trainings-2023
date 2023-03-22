package homework_12.Anush_Ananyan.Assignment_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class PhoneNumbers_NIO {
    public String[] generatePhoneNumbers(String code) {
        String[] phoneNumbers = new String[1000000];
        String phoneNumber;
        for (int i = 0; i < 1000000; i++) {
            phoneNumber = code + String.format("%06d", i) + "\n";
            phoneNumbers[i] = phoneNumber;
        }
        return phoneNumbers;
    }

    public void writeFile(String[] phoneNumbers, String fileName) {
        try (FileChannel channel = FileChannel.open(Path.of(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            for (String phoneNumber : phoneNumbers) {
                byte[] bytes = phoneNumber.getBytes();
                ByteBuffer buf = ByteBuffer.wrap(bytes);
                channel.write(buf);
            }
        } catch (IOException e) {
            System.out.println("Error writing phone numbers" + e);
        }
    }
}
