package homework_11.Roza_Petrosyan.chapter_22.file_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";

        byte[] buf = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("/Users/user/Desktop/RD/epam-trainings-2023/src/homework_11/Roza_Petrosyan/chapter_22/file_output_stream/file1.txt");
            f1 = new FileOutputStream("/Users/user/Desktop/RD/epam-trainings-2023/src/homework_11/Roza_Petrosyan/chapter_22/file_output_stream/file2.txt");
            f2 = new FileOutputStream("/Users/user/Desktop/RD/epam-trainings-2023/src/homework_11/Roza_Petrosyan/chapter_22/file_output_stream/file3.txt");

            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }

            f1.write(buf);

            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O error occurred");
        } finally {
            try {
                if (f0 != null) {
                    f0.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file1.txt");
            }

            try {
                if (f1 != null) {
                    f1.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file2.txt");
            }

            try {
                if (f2 != null) {
                    f2.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file3.txt");
            }
        }
    }
}
