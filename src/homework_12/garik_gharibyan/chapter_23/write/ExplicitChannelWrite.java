package homework_12.garik_gharibyan.chapter_23.write;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel
                (Path.of("src\\homework_12\\garik_gharibyan\\chapter_23\\write\\test.txt"),
                        StandardOpenOption.WRITE,
                        StandardOpenOption.CREATE)) {
            ByteBuffer buffer = ByteBuffer.allocate(26);

            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            buffer.rewind();
            fChan.write(buffer);

        } catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
            System.exit(1);
        }
    }
}