package homework_12.anna_manukyan.assignment_1_using_NIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class DataProcess implements FilenameFilter {
    private File inputFile;
    private File outputFile;
    private static final String BASE_PATH = "src\\homework_12\\anna_manukyan\\assignment_1_using_NIO\\";

    public String readFile(String fileName) {
        String data;
        inputFile = new File(BASE_PATH + fileName);
        if (inputFile.exists()) {
            ByteBuffer bufferedReader = ByteBuffer.allocate(1024);
            try (FileChannel channel = FileChannel.open(Paths.get(inputFile.getPath()), StandardOpenOption.READ)) {
                while ((channel.read(bufferedReader) != -1)) {
                    bufferedReader.flip();
                    data = new String(bufferedReader.array()).trim();
                    bufferedReader.clear();
                    return data;
                }
                return "File is empty.";
            } catch (FileNotFoundException e) {
                System.out.println("Can not read this file.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "File with this name is not exist or invalid format. ";
    }

    public void writeFile(String fileName, String data) {
        outputFile = new File(BASE_PATH + fileName + ".txt");
        ByteBuffer bufferWriter = ByteBuffer.wrap(data.getBytes());
        try (FileChannel fileChannel = FileChannel.open(Paths.get(outputFile.getPath()), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            fileChannel.write(bufferWriter);
            System.out.println("Successful!");
        } catch (IOException e) {
            System.out.println("Can not find file with " + fileName + " name");
        }
    }

    public String processData(String data) {
        String modifiedData = data.toUpperCase();
        return modifiedData;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt") || name.endsWith(".json") || name.endsWith(".csv");
    }
}
