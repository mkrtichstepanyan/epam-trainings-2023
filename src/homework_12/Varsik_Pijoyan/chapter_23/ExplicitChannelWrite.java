package homework_12.Varsik_Pijoyan.chapter_23;

//Write to a file using NIO.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class ExplicitChannelWrite {
    public static void main(String[] args) {

        //Obtaining a channel to a file within a try-with-resources block

        try (FileChannel fChan = (FileChannel)
                Files.newByteChannel(Path.of("test.txt"),
                                     StandardOpenOption.WRITE,
                                     StandardOpenOption.CREATE) )
        {
            //Creating a buffer.
            ByteBuffer mBuf = ByteBuffer.allocate(26);

            for (int h = 0; h < 3; h++) {
                //Writing some bytes to a buffer
                for (int i = 0; i < 26; i++) {
                    mBuf.put((byte) ('A' + i));
                }
                //Rewind the buffer so that it can be written.
                mBuf.rewind();

                //Writing the buffer to the output file.
                fChan.write(mBuf);

                //Rewind the buffer so that it can be written to again.

                mBuf.rewind();
            }
        }catch (InvalidPathException e){
            System.out.println("Path Error: " + e);
        }catch (IOException e){
            System.out.println("I/O Error: " + e);
            System.exit(1);
        }
    }
}
