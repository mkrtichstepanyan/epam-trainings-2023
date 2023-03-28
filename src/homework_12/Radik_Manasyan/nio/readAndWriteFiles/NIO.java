package homework_12.Radik_Manasyan.nio.readAndWriteFiles;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO {
    public static String readFile(String dirName, String fileName) {
        String isFilePath = null;
        StringBuilder stringBuilder = new StringBuilder();

        FilenameFilter filenameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt") || name.endsWith(".cvs") || name.endsWith(".json");
            }
        };

        if (filenameFilter.accept(new File(dirName), fileName)) {
            isFilePath = dirName + "/" + fileName;
        }
        try {
            assert isFilePath != null;
            try (FileInputStream fis = new FileInputStream(isFilePath)) {
                FileChannel channel = fis.getChannel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(4096);

                int read = channel.read(byteBuffer);
                while (read != -1) {
                    byteBuffer.flip();
                    while (byteBuffer.hasRemaining()) {
                        stringBuilder.append((char) byteBuffer.get());
                    }
                    byteBuffer.clear();
                    read = channel.read(byteBuffer);
                }
            }
        } catch (IOException | NullPointerException e) {
            System.out.println("File " + isFilePath + " not found");
        }
        return stringBuilder.toString();
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void writeFile(String fileName, String data) {
        try (FileInputStream fis = new FileInputStream(data);
             FileOutputStream fos = new FileOutputStream(fileName)) {

            FileChannel inChannel = fis.getChannel();
            FileChannel outChannel = fos.getChannel();

            ByteBuffer inBb = ByteBuffer.allocate(1024);
            ByteBuffer outBb = ByteBuffer.allocate(1024);

            int read = inChannel.read(inBb);

            while (read != -1) {
                inBb.flip();
                while (inBb.hasRemaining()) {
                    byte get = inBb.get();
                    outBb.put(get);
                }
                outBb.flip();
                outChannel.write(outBb);
                inBb.clear();
                outBb.clear();
                read = inChannel.read(inBb);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
