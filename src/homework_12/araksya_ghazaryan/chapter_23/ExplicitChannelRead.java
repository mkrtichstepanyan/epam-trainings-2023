package homework_12.araksya_ghazaryan.chapter_23;

import com.sun.source.doctree.SeeTree;

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
        try {
            filePath = Path.of("/home/araksya/Rd_Epam/epam-trainings-2023/src/homework_12/araksya_ghazaryan/chapter_23/test.txt");
        }catch (InvalidPathException e){
            System.out.println("Path Error " + e);
            return;
        }
        try (SeekableByteChannel fChan = Files.newByteChannel(filePath))
        {
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if( count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.println((char)mBuf.get());
                    }
                }
            }while (count != -1);
        }catch (IOException e){
            System.out.println("I/O Error " + e);
        }
    }
}
