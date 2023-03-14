package homework_12.aram_mehrabyan;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class FileDemo {

    public static String readFile(String filename) {
        String data = null;
        String path = "/Users/Ashot Farmanyan/Desktop/RD/epam-trainings-2023/src/homework_11/aram_mehrabyan/" + filename;
        try (FileChannel fchan = (FileChannel) Files.newByteChannel(Path.of(path))) {
            int fsize = (int) fchan.size();
            char[] str = new char[fsize];
            MappedByteBuffer mbuf = fchan.map(FileChannel.MapMode.READ_ONLY, 0, fsize);
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < fsize; i++)
                str[i] = (char) mbuf.get();
            for(char chars:str)
                sb.append(chars);
            data = sb.toString();

        } catch (InvalidPathException e) {
            System.out.println("Path error " + e);

        } catch (IOException e) {
            System.out.println("I/O" + e);
        }
        return data;

    }


    public static void writeFile(String filename,String data){
        String path = "/Users/Ashot Farmanyan/Desktop/RD/epam-trainings-2023/src/homework_11/aram_mehrabyan/" + filename;
        try(FileChannel fchan=(FileChannel) Files.newByteChannel(Path.of(path),
                StandardOpenOption.WRITE,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE)){
            char []s= data.toCharArray();
            MappedByteBuffer mbuf=fchan.map(FileChannel.MapMode.READ_WRITE,0,data.length());
            for(int i=0;i<data.length();i++)
                mbuf.put((byte) s[i]);
        }catch (InvalidPathException e){
            System.out.println("Path error "+e);

        }
        catch (IOException e){
            System.out.println("I/O"+e);
        }
    }
    static String processData(String data){
        return data.toUpperCase();
    }

    public static void main(String[] args) {
        String filename = "test.txt";
        if (filename.endsWith(".txt") || filename.endsWith(".csv") || filename.endsWith(".json")) {
            String data = readFile(filename);
             processData(data);
             writeFile("test1.txt",processData(data));
        } else
            System.out.println("Wrong file format!");


    }
}
