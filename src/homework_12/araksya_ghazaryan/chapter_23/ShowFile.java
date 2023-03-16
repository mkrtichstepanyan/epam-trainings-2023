package homework_12.araksya_ghazaryan.chapter_23;

import java.io.*;
import java.nio.file.*;
class ShowFile {
    public static void main(String[] args) {
        int i;
        if(args.length != 1 ){
            System.out.println("Usage: ShowFile filename");
            return;
        }
        try (InputStream fin = Files.newInputStream(Path.of(args[0])))
        {
            do {
                i = fin.read();
                if(i != -1)
                    System.out.println((char) i);
                }while (i != -1);
        }catch (InvalidPathException e){
            System.out.println("Path Error " + e);
        }catch (IOException e){
            System.out.println("I/O Error " + e);
        }
    }
}