package homework_12.Anush_Ananyan.Assignment_1;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ReadAndWriteWith_NIO implements FilenameFilter {

    public String readFile(String fileName) {
        StringBuilder data = new StringBuilder();
        ByteBuffer rBuf = ByteBuffer.allocate(1024);
        try (FileChannel channel = FileChannel.open(Paths.get(fileName), StandardOpenOption.READ)) {
            while (channel.read(rBuf) != -1) {
                rBuf.flip();
                data.append(Charset.defaultCharset().decode(rBuf));
                rBuf.clear();
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        } catch (IOException e) {
            System.out.println("Error during reading the file " + fileName);
        }
        return data.toString();
    }

    public void writeFile(String fileName, String data) {
        ByteBuffer wBuf = ByteBuffer.wrap(data.getBytes());
        try (FileChannel channel = FileChannel.open(Paths.get(fileName),
                StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            channel.write(wBuf);
            wBuf.flip();
        } catch (IOException e) {
            System.out.println("Error during writing the file " + fileName);
        }
    }

    public String processData(String data) {
        return data.toUpperCase();
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(".json") || name.endsWith(".txt") || name.endsWith("cvs");
    }

}

