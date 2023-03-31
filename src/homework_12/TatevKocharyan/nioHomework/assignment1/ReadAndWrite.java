package homework_12.TatevKocharyan.nioHomework.assignment1;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndWrite {

    public static String readFile(String fileName) {


        String content = "";
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".cvs") || fileName.endsWith(".json")) {
                while (channel.read(buffer) != -1) {
                    content = new String(buffer.array()).trim();
                }
            }
        } catch (IOException ex) {
            System.out.println("unsupported file format");
        }
        return content;
    }

    public static void writeFile(String fileName, String data) {
        ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get("Eexample.txt"),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            if (fileName.endsWith(".txt") || fileName.endsWith(".cvs") || fileName.endsWith(".json")) {
                channel.write(buffer);
            } else {
                System.out.println("unsupported file format");
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }

    public static String processData(String data) {
        String fileName = "C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\text.txt";
        String dataUppercase = data.toUpperCase();
        writeFile(fileName, dataUppercase);

        return dataUppercase;
    }
}