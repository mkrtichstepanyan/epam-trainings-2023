package homework_12.gohar_hakobyan.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        if (args.length != 1) {
            System.out.println("Use: ShowFile name of file ");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) { //try with resources
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            }
            while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File can not be opened.");
        } catch (IOException e) {
            System.out.println("I/o error: " + e);
        }
    }
}
