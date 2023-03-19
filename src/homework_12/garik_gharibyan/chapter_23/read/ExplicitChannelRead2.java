package homework_12.garik_gharibyan.chapter_23.read;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;

        try(SeekableByteChannel fChan = Files.newByteChannel(Path.of("src\\homework_12\\garik_gharibyan\\chapter_23\\read\\test.txt"))) {

            ByteBuffer buf = ByteBuffer.allocate(128);
            count = fChan.read(buf);

            while (count != -1){
                buf.rewind();
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf.get());
                }
                count = fChan.read(buf);
            }

        }
        catch (InvalidPathException e) {
            System.out.println("Path Error " + e);
        }
        catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }

}
