package homework_12.Ani_Barseghyan.assignment_2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteToFile {
    public static void writeFile(String fileName, String[] data) {
        try (FileChannel fileChannel = FileChannel.open(Paths.get(fileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            for (String d : data) {
                byte[] byteArray = d.getBytes();
                ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
                fileChannel.write(byteBuffer);
            }
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
