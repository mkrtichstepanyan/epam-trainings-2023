package homework_12.Nona_Asatryan.chapter23;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class MappedChannelRead {
    public static void main(String[] args) {

        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Path.of("/Users/nona.asatryan/epam-trainings-2023/src/homework_12/Nona_Asatryan/chapter23/test.txt"))) {
            long fSize = fChan.size();
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char) mBuf.get());
            }
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Path Error: " + e);
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
