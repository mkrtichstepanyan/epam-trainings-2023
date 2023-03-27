package homework_12.Zara_Avetyan.assignment_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GeneratePhoneNumbers {
    public String[] generatePhoneNumbers(String code){
        String[] phoneNumbers = new String[1000000];
        for (int i=0; i<1000000; i++){
            phoneNumbers[i] = code+String.format("%06d\n", i);
        }
        return phoneNumbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName){
        ByteBuffer buffer;
        try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String phoneNumber: phoneNumbers){
                buffer = ByteBuffer.wrap(phoneNumber.getBytes());
                channel.write(buffer);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
