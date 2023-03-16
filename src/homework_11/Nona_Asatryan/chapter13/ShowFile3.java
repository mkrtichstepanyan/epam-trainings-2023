package homework_11.Nona_Asatryan.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile3 {

    public static void main(String[] args) {
        int i;

        if (args.length != 1) {
            System.out.println("Usage: ShowFile3 filename");
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) ;
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("An I/O Error occurred");
        }
    }
}
