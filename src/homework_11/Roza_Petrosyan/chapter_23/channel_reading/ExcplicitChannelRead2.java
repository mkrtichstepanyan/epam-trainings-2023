package homework_11.Roza_Petrosyan.chapter_23.channel_reading;

import java.io.IOError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExcplicitChannelRead2 {
    public static void main(String[] args) {
        int count;

        try (SeekableByteChannel fChan = Files.newByteChannel(Path.of("src/homework_11/Roza_Petrosyan/chapter_23/channel_reading/test.txt"))) {
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(mBuf);

                if (count != -1) {
                    mBuf.rewind();
                }

                for (int i = 0; i < count; i++) {
                    System.out.print((char) mBuf.get());
                }
            } while (count != -1);

            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
        } catch (IOError | IOException e) {
            System.out.println("I/O Error: " + e);
        }

    }

}
