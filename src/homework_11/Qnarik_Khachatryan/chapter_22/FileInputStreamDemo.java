package homework_11.Qnarik_Khachatryan.chapter_22;

//Demonstrate FileInputStream.

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        //Use try-with-resources to close the stream.
        try (FileInputStream f = new FileInputStream("src/homework_11/Qnarik_Khachatryan/chapter_22/" +
                "FileInputStreamDemo.java")) { //create an InputStream object
            System.out.println("Total Available Bytes: " + (size = f.available()));  //number of bytes of input
            // currently available for reading
            int n = size / 40;
            System.out.println("First " + n + "bytes of the file one read() at a time");
            for (int i = 0; i < n; i++) {
                System.out.println((char) f.read()); // read first n chars
            }
            System.out.println("\nStill Available: " + f.available());  // show how many bytes still available for reading
            System.out.println("Reading the next " + n + " with one read(b[])"); //n = still available bytes / 40
            byte[] b = new byte[n];
            if (f.read(b) != n) {  //
                System.err.println("couldn't read " + n + " bytes.");
            }
            System.out.println(new String(b, 0, n)); //offset-смещение
            System.out.println("\nStill Available: " + f.available());

            System.out.println("Reading " + n / 2 + " into the end of array");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.out.println("couldn't read " + n / 2 + " bytes.");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill Available: " + f.available());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
