package homework_12.Varsik_Pijoyan.chapter_23;
//Using a mapped file to read a file

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {

        //Obtaining a channel to a file within a try-with-resources block.
        try(FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("test.txt")) ){
            //Getting the size of the file
            long fSize = fChan.size();

            //Now, map the file into a buffer
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);

            //Reading and displaying bytes from buffer.
            for (int i = 0; i < fSize; i++) {
                System.out.println((char) mBuf.get());
            }
            System.out.println();
        }catch (InvalidPathException e){
            System.out.println("Path Error: " + e);
        }catch (IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}
