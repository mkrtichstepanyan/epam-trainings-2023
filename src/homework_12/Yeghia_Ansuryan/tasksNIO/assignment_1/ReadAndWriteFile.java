package homework_12.Yeghia_Ansuryan.tasksNIO.assignment_1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndWriteFile implements FilenameFilter {
    public static String readFile(String fileName) {
        String data = " ";
        ByteBuffer rb = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
            while (channel.read(rb) != -1) {
                rb.flip();
                data = new String(rb.array()).trim();
                rb.clear();
            }
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
            return null;
        }
        System.out.println(data);
        return data;
    }

    public static void writeFile(String fileName, String data) {
        ByteBuffer wb = ByteBuffer.wrap(data.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(wb);
            wb.flip();
            wb.clear();
        } catch (IOException e) {
            System.out.println(fileName + " does not exist");
        }
        System.out.println(data);
    }

    public static String processData(String data) {
        writeFile("Users/yeghia.ansuryan/epam-training-2023/src/homework_11/Yeghia_Ansuryan/" +
                "tasksNIO/assignment_1/nioFile.txt", data.toUpperCase());
        return data;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(".txt") || name.endsWith(".json") || name.endsWith(".csv");
    }
}
