package homework_12.Argishti_Mesropyan.Assignment_1;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndWriteFile  {
    public static String readFile(String fileName) {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
                channel.read(buffer);
                buffer.flip();
                String content = new String(buffer.array()).trim();
                return "The content of file " + content;
            } catch (IOException e) {
                System.out.println("I/O error " + e);
                return "";
            }
        } else {
            System.out.println("Error file format");
            return "";
        }
    }

    public static void writeFile(String writingFileName, String readingFileName) {
        String message = readFile(readingFileName);
        String precessedMessage = precessData(message);
        ByteBuffer buffer = ByteBuffer.wrap(precessedMessage.getBytes());
        if (writingFileName.endsWith(".txt") || writingFileName.endsWith(".csv") || writingFileName.endsWith(".json")) {
            try (FileChannel channel = FileChannel.open(Paths.get(writingFileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                channel.write(buffer);
            } catch (IOException e) {
                System.out.println("I/O error " + e);
            }
        } else {
            System.out.println("Error file format");
        }
    }

    public static String precessData(String data) {
        String dataUpperCase = data.toUpperCase();
        return dataUpperCase;
    }
}
