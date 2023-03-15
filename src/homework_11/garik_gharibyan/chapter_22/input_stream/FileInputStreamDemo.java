package homework_11.garik_gharibyan.chapter_22.input_stream;

import java.io.*;

public class FileInputStreamDemo {

    public static void main(String[] args) {
        File file = new File("src/homework_11/garik_gharibyan/chapter_22/input_stream/text.txt");

        int size;


        try(FileInputStream f = new FileInputStream(file) ) {
            size = f.available();
            System.out.println("Total available bytes: " + size);

            int n = size / 40;
            System.out.println("First " + n + " bytes of the file one read() at the time");

            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nStill available: " + f.available());
            System.out.println("Reading the next " + n + " with one read(b[])");

            byte[] b = new byte[n];
            int t  = f.read(b);
            if (t != n){
                System.err.println("couldn't read " + n + " bytes");
            }

            String s = new String(b,0,n);
            System.out.println(s);

            System.out.println("\nStill available: " + (size = f.available()));
            System.out.println("Skipping");
            f.skip(size / 2);
            System.out.println("\nStill available: " + f.available());

            System.out.println("Reading " + n/2 + " into the end of array");
            int k = f.read(b,n/2,n/2);
            if (k != n/2) {
                System.err.println("couldn't read " + n/2 + " bytes");
            }

            System.out.println(new String(b,0,b.length));
            System.out.println("\nStill available: " + f.available());


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
