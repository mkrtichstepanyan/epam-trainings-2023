package classwork.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFileExample {

    public static void main(String[] args)  {
        // Writing to a file
        String message = "Hello, file!";
        ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get("example.txt"),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from a file
        ByteBuffer readBuffer = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get("example.txt"),
                StandardOpenOption.READ)) {
            channel.read(readBuffer);
            readBuffer.flip();
            String content = new String(readBuffer.array()).trim();
            System.out.println("File content: " + content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
