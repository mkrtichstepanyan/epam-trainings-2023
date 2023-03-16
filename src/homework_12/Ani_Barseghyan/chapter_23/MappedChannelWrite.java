package homework_12.Ani_Barseghyan.chapter_23;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MappedChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Path.of("C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_12\\Ani_Barseghyan\\chapter_23\\test.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.READ)) {
            MappedByteBuffer mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                mappedByteBuffer.put((byte) ('A' + i));
            }
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
