package homework_12.Ani_Barseghyan.assignment_1;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileReadWrite extends FileNameCheck {
    static FileNameCheck checkName = new FileNameCheck();

    public static String readFile(String fileName) {
        StringBuilder builder = new StringBuilder();
        if (checkName.accept(new File(fileName))) {
            String line;
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            try (FileChannel fileChannel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
                while (fileChannel.read(byteBuffer) > 0) {
                    byteBuffer.flip();
                    line = new String(byteBuffer.array()).trim();
                    builder.append(line).append("\n");
                }
            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
        return builder.toString();
    }

    public static void writeFile(String fileName, String data) {
        byte[] byteArray = data.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        try (FileChannel fileChannel = FileChannel.open(Paths.get(fileName), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            fileChannel.write(byteBuffer);
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
}

