package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        //use try-with-resources to close the stream
        try (FileInputStream fis = new FileInputStream("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\FileInputStreamDemo.java")) {
            System.out.println("Total available Bytes: " + (size = fis.available()));

            int n = size / 40;
            System.out.println("first " + n + " bytes of the file one read() at a time");
            for (int i = 0; i < n; i++) {
                System.out.print((char) fis.read());
            }
            System.out.println("\nStill Available: " + fis.available());
            System.out.println("Reading the next " + n + " with one read(b[])");
            byte[] b = new byte[n];
            if (fis.read(b) != n) {
                System.out.println("could not read " + n + " bytes");
            }
            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available: " + (size = fis.available()));
            System.out.println("Skipping half of remaining bytes with skip()");
            fis.skip(size / 2);
            System.out.println("Still available: " + fis.available());
            System.out.println("Reading " + n / 2 + " into the end of array");
            if (fis.read(b, n / 2, n / 2) != n / 2) {
                System.out.println("couldn`t read " + n / 2 + " bytes");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill Available: " + fis.available());
        } catch (IOException e) {
            System.out.println("I\\O Error: " + e);
        }
    }
}
