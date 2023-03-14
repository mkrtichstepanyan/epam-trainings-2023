package homework_12.Varsik_Pijoyan.chapter_23;

//Writing to a mapped file.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelWrite {
    public static void main(String[] args) {
        //Obtaining a channel to a file within a try-with-resources block

        try (FileChannel fChan = (FileChannel)
             Files.newByteChannel(Path.of("test.txt"),
                      StandardOpenOption.WRITE,
                      StandardOpenOption.READ,
                      StandardOpenOption.CREATE) )
        {
            //Then, map the file into a buffer.
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            //Write some bytes to the buffer.
            for (int i = 0; i < 26; i++) {
                mBuf.put((byte) ('A' + i));
            }
        }catch (InvalidPathException e){
            System.out.println("Path Error: " + e);
        }catch(IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}
