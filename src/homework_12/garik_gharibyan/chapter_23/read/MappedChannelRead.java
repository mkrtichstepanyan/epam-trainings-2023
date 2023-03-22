package homework_12.garik_gharibyan.chapter_23.read;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

public class MappedChannelRead {
    public static void main(String[] args) {
        try(FileChannel fChan =(FileChannel) Files.newByteChannel(Path.of("src\\homework_12\\garik_gharibyan\\chapter_23\\read\\test.txt"))){
            long fSize = fChan.size();
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Error 0 " + e);
        }
    }
}
