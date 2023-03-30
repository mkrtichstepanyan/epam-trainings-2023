package homework_12.TatevKocharyan.chapter23;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;

        try (SeekableByteChannel fChan = Files.newByteChannel(Path.of("NioExample.txt"))) {
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.println((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}