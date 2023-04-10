package homework_11.TatevKocharyan.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("Usage: Showfile filename: ");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }
finally {
            try {
                if(fin!=null)fin.close();
            }catch (IOException e){
                System.out.println("Error closing File");
            }


        }

    }
}