package homework_12.Roza_Petrosyan.chapter_23.mapped_channel_read_write;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("src/homework_12/Roza_Petrosyan/chapter_23/mapped_channel_read_write/test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE,
                StandardOpenOption.READ)) {
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
