package homework_12.anna_manukyan.assignment_2_using_NIO;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumberGenerator {
    private static final String BASE_PATH = "src\\homework_12\\anna_manukyan\\assignment_2_using_NIO\\";
    private List<String> phoneNumbers = new ArrayList<>();

    public List<String> generatePhoneNumbers(String code) {
        String tmpNumber = "";
        for (int i = 0; i < 1000000; i++) {
            tmpNumber = code + String.format("%06d", i);
            phoneNumbers.add(tmpNumber);
        }
        return phoneNumbers;
    }

    public void writeToFile(List<String> phoneNumbers, String fileName) {
        File file = new File(BASE_PATH + fileName);
        ByteBuffer bufferWriter = ByteBuffer.wrap(phoneNumbers.toString().getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get(file.getPath()), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(bufferWriter);
            System.out.println("Phone Numbers list was created successfully!");
        } catch (IOException e) {
            System.out.println("Can not write phoneNumbers in " + fileName + " file");
        }
    }
}
