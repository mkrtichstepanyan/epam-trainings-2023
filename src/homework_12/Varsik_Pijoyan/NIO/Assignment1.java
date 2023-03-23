package homework_12.Varsik_Pijoyan.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Assignment1 {
    private static String readFile(String fileName) {
        if (isSupportedFormat(fileName)) {
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
                channel.read(readBuffer);
                readBuffer.flip();
                String content = new String(readBuffer.array()).trim();
                return content;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    private static void writeFile(String fileName, String data) {
        if (isSupportedFormat(fileName)) {
            ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
            try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                channel.write(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String processData(String data) {
        if (data != null) {
            return data.toUpperCase();
        }
        return "No data for modification";
    }

    private static boolean isSupportedFormat(String filename) {
        if (filename.endsWith(".txt") || filename.endsWith(".csv") || filename.endsWith(".json")) {
            return true;
        } else {
            System.out.println("Specified format does not supported by program");
            return false;
        }
    }

    public static void main(String[] args) {
        String data = readFile("src/homework_12/Varsik_Pijoyan/NIO/" +
                "file/test.txt");
        String modifiedData = processData(data);
        writeFile("src/homework_12/Varsik_Pijoyan/NIO/" +
                "file/test.txt", modifiedData);
    }
}
