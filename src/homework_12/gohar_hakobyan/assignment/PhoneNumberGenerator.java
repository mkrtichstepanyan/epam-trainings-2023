package homework_12.gohar_hakobyan.assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import static homework_12.gohar_hakobyan.assignment.FileUtil.FILE_PATH;

public class PhoneNumberGenerator {

    public static List<String> generatePhoneNumbers(String code) {
        List<String> numbers = new ArrayList<>();
        if (!code.equals("093")) {
            System.out.println("Code can only start's with 093");
            System.exit(0);
        }
        for (int i = 0; i <= 1000000; i++) {
            String phoneNumber = String.format("%s%06d", code, i);
            numbers.add(phoneNumber);
        }
        return numbers;
    }

    public static void writeToFile(List<String> phoneNumbers, String fileName) {
        try (FileChannel channel = FileChannel.open(Paths.get(FILE_PATH),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String phoneNumber : phoneNumbers) {
                ByteBuffer buffer = ByteBuffer.wrap((phoneNumber + "\n").getBytes());
                channel.write(buffer);
                System.out.println("File writing completed successfully.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file!" + fileName);
            System.exit(0);
        }

    }
}

