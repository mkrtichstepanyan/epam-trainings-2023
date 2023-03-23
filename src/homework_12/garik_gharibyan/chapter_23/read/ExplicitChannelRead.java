package homework_12.garik_gharibyan.chapter_23.read;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;
        try {
            filePath = Path.of("src\\homework_12\\garik_gharibyan\\chapter_23\\read\\test.txt");
        }catch (InvalidPathException e){
            System.out.println("Path Error: " + e);
            return;
        }
        try(SeekableByteChannel fChan = Files.newByteChannel(filePath)) {
            ByteBuffer buf = ByteBuffer.allocate(128);

            do {
                count = fChan.read(buf);
                buf.rewind();

                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf.get());
                }

            }while (count != -1);
            System.out.println();

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
