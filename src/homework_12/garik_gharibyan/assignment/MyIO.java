package homework_12.garik_gharibyan.assignment;

import java.io.*;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class MyIO {
    public static String readFile(String fileName) {

        StringBuilder str = new StringBuilder();

        try (FileChannel channel = (FileChannel) Files.newByteChannel(Path.of(fileName))) {

            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
            for (int i = 0; i < channel.size(); i++) {
                char c = (char) map.get();
                str.append(c);
            }
        } catch (IOException e) {
            System.err.print(e);
            System.exit(0);
        }
        return str.toString();
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void writFile(String fileName, String data) {

        try (FileChannel channel = (FileChannel) Files.newByteChannel(
                Path.of(fileName),
                StandardOpenOption.READ,
                StandardOpenOption.WRITE,
                StandardOpenOption.CREATE)) {

            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_WRITE, 0, data.length());
            map.put(data.getBytes());

        } catch (IOException e) {
            System.err.println(e);
            System.exit(0);
        }
    }

    public static void writePhoneNumber(String[] phoneNumbers, String fileName) {

        StringBuilder stringBuilder = new StringBuilder();
        for (String phoneNumber: phoneNumbers) {
            stringBuilder.append(phoneNumber).append("\n");
        }

            try (FileChannel fChan = (FileChannel) Files.newByteChannel(
                    Path.of(fileName),
                    StandardOpenOption.WRITE,
                    StandardOpenOption.READ,
                    StandardOpenOption.CREATE)) {


                    MappedByteBuffer map = fChan.map(FileChannel.MapMode.READ_WRITE, 0, stringBuilder.length());
                    map.put(String.valueOf(stringBuilder).getBytes());


            } catch (IOException e) {
                System.err.println(e);
                System.exit(400);
            }
    }
}
