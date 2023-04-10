package homework_12.rafik_pahlevanyan.chapter_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fileInputStream;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        //Attempt to open the file
        try {
            fileInputStream = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot open File");
            return;
        }

        //at this point , the file is open and can be read
        try {
            do {
                i = fileInputStream.read();
                if (i != 1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error Reading File");
        }

        //close the file
        finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
