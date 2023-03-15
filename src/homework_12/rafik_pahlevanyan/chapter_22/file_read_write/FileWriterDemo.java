package homework_12.rafik_pahlevanyan.chapter_22.file_read_write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" + " to come to the aid of their country\n" +
                " and pay their due taxes";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f = new FileWriter("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_read_write\\file.txt");
             FileWriter f1 = new FileWriter("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_read_write\\file1.txt");
             FileWriter f2 = new FileWriter("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_read_write\\file2.txt")) {
            //write to first file
            for (int i = 0; i < buffer.length; i += 2) {
                f.write(buffer[i]);
            }
            f1.write(buffer);

            //write to third file
            f1.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O Error occured");
        }
    }
}
