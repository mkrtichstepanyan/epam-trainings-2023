package homework_12.TatevKocharyan.chapter22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;
        try (FileInputStream f = new FileInputStream(new File("C:\\Users\\Lenovo\\Desktop\\java\\davo.txt"))) {

            System.out.println("Total Available Bytes: " + (size = f.available()));

            int n = size / 40;
            System.out.println("First " + n + "bytes of the file one read() at a time");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read());
            }
            System.out.println("\n Still Available:" + f.available());

            System.out.println("Reading the next " + n + "with one read(b[])");
            byte[] b = new byte[n];
            if (f.read(b) != n) {
                System.out.println("couldn't read" + n + "bytes");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\n Still available: " + (size = f.available()));
            System.out.println("Skipping half of remaiin bytes with skip");
            f.skip(size / 2);
            System.out.println("Still available: " + f.available());
            System.out.println("Reading" + n / 2 + "into the end of array");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("couldn't read" + n / 2 + "bytes.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill available:" + f.available());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
