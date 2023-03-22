package homework_12.Karen_Sargsyan.assignment_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCreator {
    String[] generatePhoneNumbers(String code) {
        String[] numbers = new String[1000000];
        int incrementAbleNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
             numbers[i] = code + String.format("%06d", incrementAbleNumber) + "\n";
             incrementAbleNumber++;
        }
        return numbers;
    }

    public void writeToFile(String[] phoneNumbers, String fileName) {
        ByteBuffer buffer;
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String perNumber : phoneNumbers) {
                buffer = ByteBuffer.wrap(perNumber.getBytes());
                if (perNumber != null) {
                    channel.write(buffer);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
