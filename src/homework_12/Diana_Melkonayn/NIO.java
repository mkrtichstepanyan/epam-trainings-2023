package homework_12.Diana_Melkonayn;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIO {
    public static void writeFile(String fileName, String data) {

        ByteBuffer byteBuffer = ByteBuffer.wrap(data.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(byteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String fileName) {

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.READ)) {
            channel.read(buffer);
            buffer.flip();
            String content = new String(buffer.array()).trim();
            return content;

    } catch(IOException e){
        e.printStackTrace();
    }
    return null;
}


    public static String processData(String data) {

        return data.toUpperCase();
    }
}
