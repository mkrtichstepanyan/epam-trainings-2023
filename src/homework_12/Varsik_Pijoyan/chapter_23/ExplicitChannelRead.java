package homework_12.Varsik_Pijoyan.chapter_23;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filePath = null;

        //First: obtaining a path to the file
        try {
            filePath = Path.of("test.txt");
        }catch (InvalidPathException exc){
            System.out.println("Path Error: " + exc);
            return;
        }

        //Next: obtaining a channel to that file within a try-with-resources block
        try (SeekableByteChannel fChannel = Files.newByteChannel(filePath)){
            ByteBuffer mBuf = ByteBuffer.allocate(128);

            do {
                //Read a buffer
                count = fChannel.read(mBuf);

                //Stop when end of file is reached
                if (count != -1){
                    //Rewind the buffer so that it can be read
                    mBuf.rewind();

                    //Read bytes from the buffer and show
                    //them on the screen as characters
                    for (int i = 0; i < count; i++)
                        System.out.println((char) mBuf.get());
                }
            }while (count != -1);

            System.out.println();
        }catch (IOException exc){
            System.out.println("I/O Error: " + exc);
        }
    }
}
