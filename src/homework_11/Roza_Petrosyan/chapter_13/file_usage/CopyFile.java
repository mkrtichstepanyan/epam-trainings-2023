package homework_11.Roza_Petrosyan.chapter_13.file_usage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                i = fin.read();
                if(i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O exception: " + e);
        } finally {
            try{
                if(fin != null) {
                    fin.close();
                }
            } catch (IOException e) {
                System.out.println("Error CLosing Input File");
            }

            try{
                if(fout != null) {
                    fout.close();
                }
            } catch (IOException e) {
                System.out.println("Error CLosing Output File");
            }
        }
    }
}
