package homework_12.Ani_Barseghyan.chapter_23;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;

        try (SeekableByteChannel fChan = Files.newByteChannel((Path.of("test.txt")))) {
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(mBuf);

                if (count != -1) {
                    mBuf.rewind();
                }

                for (int i = 0; i < count; i++) {
                    System.out.println((char) mBuf.get());
                }
            } while (count != -1);
        } catch (InvalidPathException e) {
            System.out.println("Path Error");
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
