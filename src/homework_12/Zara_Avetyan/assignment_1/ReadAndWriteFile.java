package homework_12.Zara_Avetyan.assignment_1;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndWriteFile {

    public String readFile(String fileName) {
        String line = "";
        int data;
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            ByteBuffer readBuffer = ByteBuffer.allocate(1024);
            try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
                channel.read(readBuffer);
                readBuffer.flip();
                return new String(readBuffer.array()).trim();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return "Wrong format.";
    }

    public String processData(String data) {
        String line = "";
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '_') {
                line += " ";
            } else line += (char) data.charAt(i);
        }
        return line.toUpperCase();
    }

    public void writeFile(String fileName, String data) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
            try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                channel.write(buffer);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else System.out.println("Wrong format.");
    }
}
