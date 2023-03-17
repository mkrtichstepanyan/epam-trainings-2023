package homework_12.araksya_ghazaryan.chapter_23;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fChan =(FileChannel) Files.newByteChannel(
                Path.of("/home/araksya/Rd_Epam/epam-trainings-2023/src/homework_12/araksya_ghazaryan/chapter_23/test.txt"),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE) ) {
           MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0,26);
            for (int i = 0; i < 26; i++)
                mBuf.put((byte) ('A' + i));
        }catch (InvalidPathException e){
            System.out.println("Path Error " + e);
        }catch (IOException e){
            System.out.println("I/O Error " + e);
            System.exit(1);
        }
    }
}