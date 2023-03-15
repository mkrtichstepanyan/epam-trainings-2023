package homework_11.garik_gharibyan.chapter_22.output_atream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        byte[] buf = source.getBytes();

        try (FileOutputStream f0 = new FileOutputStream("src/homework_11/garik_gharibyan/chapter_22/output_atream/text1.txt");
             FileOutputStream f1 = new FileOutputStream("src/homework_11/garik_gharibyan/chapter_22/output_atream/text2.txt");
             FileOutputStream f2 = new FileOutputStream("src/homework_11/garik_gharibyan/chapter_22/output_atream/text3.txt");
        ) {
            for (int i = 0; i < buf.length; i += 2) {
                f0.write(buf[i]);
            }
            f1.write(buf);

            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
