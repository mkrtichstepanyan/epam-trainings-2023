package homework_12.gohar_hakobyan.assignment;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileUtil implements FilenameFilter {

    public static final String FILE_PATH = "C:\\Users\\Noname\\Desktop\\EPAM2023\\epam-trainings-2023\\src\\homework_12\\gohar_hakobyan\\assignment\\file\\file.txt";

    //reading to a file
    public static String readFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (FileChannel channel = FileChannel.open(Paths.get(FILE_PATH),
                StandardOpenOption.READ)) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (channel.read(buffer) != -1) {
                buffer.flip();
                sb.append(Charset.defaultCharset().decode(buffer));
                buffer.clear();
            }
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading file " + fileName);
            System.exit(0);
        }
        return sb.toString();
    }

    //writing to a file
    public static void writeFile(String filename, String data) {
        ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get(FILE_PATH),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(buffer);
            System.out.println("The data are successfully written.");
        } catch (IOException ex) {
            System.out.println("Error: An error occurred while writing to file " + filename);
            System.exit(0);
        }
    }

    // Takes the data as input and  returns the modified data
    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void fileChecker(File file) {
        if (!(file.isFile() && file.exists())) {
            System.out.println("Error: File doesn't exist.");
        }
    }

    @Override
    public boolean accept(File file, String name) {
        return file.getName().endsWith(".txt") || !file.getName().endsWith(".csv")
                || !file.getName().endsWith(".json");
    }
}
