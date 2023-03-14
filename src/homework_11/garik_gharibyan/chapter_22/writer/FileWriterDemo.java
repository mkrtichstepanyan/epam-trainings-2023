package homework_11.garik_gharibyan.chapter_22.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (
                FileWriter f0 = new FileWriter("src/homework_11/garik_gharibyan/chapter_22/writer/text1.txt");
                FileWriter f1 = new FileWriter("src/homework_11/garik_gharibyan/chapter_22/writer/text2.txt");
                FileWriter f2 = new FileWriter("src/homework_11/garik_gharibyan/chapter_22/writer/text3.txt"))
        {
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }
            f1.write(buffer);
            f2.write(buffer,buffer.length - buffer.length/4,buffer.length/4);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
