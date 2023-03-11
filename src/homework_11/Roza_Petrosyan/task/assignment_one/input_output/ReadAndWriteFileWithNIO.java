package homework_11.Roza_Petrosyan.task.assignment_one.input_output;

import homework_11.Roza_Petrosyan.task.assignment_one.exception.FileExtensionException;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadAndWriteFileWithNIO {
    public String readFile(String fileName) {
        StringBuilder data = new StringBuilder();
        if (isAllowedFileExtension(fileName)) {
            try (FileChannel fileChannel = FileChannel.open(Path.of(fileName),
                    StandardOpenOption.READ)) {
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int bytesRead = fileChannel.read(buffer);
                while (bytesRead != -1) {
                    buffer.flip();
                    while (buffer.hasRemaining()) {
                        data.append((char) buffer.get());
                    }
                    buffer.clear();
                    bytesRead = fileChannel.read(buffer);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            }
        } else {
            throw new FileExtensionException();
        }
        return data.toString();
    }

    public void writeFile(String fileName, String data) {
        byte[] byteArray = data.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byteArray);
        if (isAllowedFileExtension(fileName)) {
            try (FileChannel fileChannel = FileChannel.open(Path.of(fileName),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.WRITE)) {
                fileChannel.write(byteBuffer);
            } catch (IOException e) {
                System.out.println("An I/O error occurred: " + e.getMessage());
            }
        } else {
            throw new FileExtensionException();
        }
    }

    public String processData(String data) {
        return data != null ? data.toUpperCase() : "";
    }

    private boolean isAllowedFileExtension(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf("."));
        return extension.equals(".json") || extension.equals(".csv") || extension.equals(".txt");
    }
}
