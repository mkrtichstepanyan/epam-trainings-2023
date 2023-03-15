package homework_11.Qnarik_Khachatryan.chapter_22;

import java.io.FileOutputStream;
import java.io.IOException;

//Demonstrate FileOutputStream - class creates OutputStream object that can be used to write bytes to a file
// This program uses the traditional approach to closing a file
class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men to come to the aid of their country and pay their due taxes.";
        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;
        try {
            f0 = new FileOutputStream("src/homework_11/Qnarik_Khachatryan/chapter_22/files/file1.txt");
            f1 = new FileOutputStream("src/homework_11/Qnarik_Khachatryan/chapter_22/files/file2.txt");
            f2 = new FileOutputStream("src/homework_11/Qnarik_Khachatryan/chapter_22/files/file3.txt");

            //write to the first file
            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]); // every other byte from the sample.
            }

            // write to second file
            f1.write(buf); // entire set of bytes.

            //write to third file
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4); // only the last quarter
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        } finally {
            try {
                if (f0 != null) {
                    f0.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing file1.txt");
            }
            try {
                if (f1 != null) {
                    f1.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing file2.txt");
            }
            try {
                if (f2 != null) {
                    f2.close();
                }
            } catch (IOException e) {
                System.out.println("Error Closing file3.txt");
            }
        }
    }
}
