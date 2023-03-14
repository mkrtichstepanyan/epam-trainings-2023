package homework_12.Hovhannes_Gspeyan;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NioFileImplementor implements FilenameFilter {

    public static String readFile(String fileName) {
        String content = "";
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
            while (channel.read(readBuffer) != -1) {
                readBuffer.flip();
                content = new String(readBuffer.array()).trim();
                readBuffer.clear();
            }
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
            return null;
        }
        System.out.println(content);
        return content;
    }

    public static void writeFile(String fileName, String data) {
        ByteBuffer writeBuffer = ByteBuffer.wrap(data.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(writeBuffer);
            writeBuffer.flip();
            writeBuffer.clear();
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
        }
        System.out.println(data);
    }

    public static String processData(String data) {
        writeFile("C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\src\\homework_12\\" +
                "Hovhannes_Gspeyan\\nioModifiedData.txt", data.toUpperCase());
        return data;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt") || name.endsWith(".json") || name.endsWith(".csv");
    }
}
