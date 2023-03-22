package homework_11.TatevKocharyan.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;

        FileInputStream fin = null;
        FileOutputStream fout = null;
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);
            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O error:" + e);
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    System.out.println("Error Closing input File");
                }
            }

            if (fout != null) {
                try {
                    fout.close();
                } catch (IOException e) {
                    System.out.println("Error Closing output File");
                }
            }
        }
    }
}