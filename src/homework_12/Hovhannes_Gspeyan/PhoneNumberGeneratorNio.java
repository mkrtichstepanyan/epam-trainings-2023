package homework_12.Hovhannes_Gspeyan;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class PhoneNumberGeneratorNio {
    public static String[] generatePhoneNumber(String code) {
        int digit1, digit2, digit3, digit4, digit5, digit6;
        int count = 1000000;
        String[] arr = new String[count];
        for (int i = 0; i < arr.length; i++) {
            String suffix = "";
            digit1 = i / 100000;
            digit2 = (i / 10000) % 10;
            digit3 = (i / 1000) % 10;
            digit4 = (i / 100) % 10;
            digit5 = (i / 10) % 10;
            digit6 = i % 10;
            for (int j = 0; j < 6; j++) {
                suffix = digit1 + "" + digit2 + "" + digit3 + "" + digit4 + "" + digit5 + "" + digit6;
            }
            arr[i] = code + suffix;
        }
        return arr;
    }

    public static void writeToFile(String[] phoneNumbers, String fileName) {
        ByteBuffer writeBuffer = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            int count = 0;
            for (String phoneNumber : phoneNumbers) {
                String suffix = phoneNumber + ", ";
                writeBuffer.put(suffix.getBytes());
                count++;
                if (count == 10) {
                    writeBuffer.flip();
                    channel.write(writeBuffer);
                    writeBuffer.clear();
                    writeBuffer.put(System.lineSeparator().getBytes());
                    count = 0;
                }
            }
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(generatePhoneNumber("093")));
        writeToFile(generatePhoneNumber("093"), "C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\" +
                "src\\homework_12\\Hovhannes_Gspeyan\\nioNumbers.txt");
    }
}
