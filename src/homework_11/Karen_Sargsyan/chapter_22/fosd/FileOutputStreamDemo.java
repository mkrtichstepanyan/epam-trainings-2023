package homework_11.Karen_Sargsyan.chapter_22.fosd;

import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";

        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            f1.write(buf);
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IIOException e) {
            System.out.println("An I/O Error Occurred");
        } finally {
            try {
                if (f0 != null) {
                    f0.close();
                }
            } catch (IIOException e) {
                System.out.println("Error Closing file1.txt");
            }
            try {
                if (f1 != null) {
                    f1.close();
                }
            } catch (IIOException e) {
                System.out.println("Error Closing file2.txt");
            }
            try {
                if (f2 != null) {
                    f2.close();
                }
            } catch (IIOException e) {
                System.out.println("Error Closing file3.txt");
            }
        }
    }

}
