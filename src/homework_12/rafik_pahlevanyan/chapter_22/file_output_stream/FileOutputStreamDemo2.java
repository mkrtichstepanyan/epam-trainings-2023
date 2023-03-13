package homework_12.rafik_pahlevanyan.chapter_22.file_output_stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country \n" +
                " and pay their due taxes";
        byte[] buf = source.getBytes();


        try (FileOutputStream f = new FileOutputStream("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_output_stream\\file.txt");
             FileOutputStream f1 = new FileOutputStream("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_output_stream\\file1.txt");
             FileOutputStream f2 = new FileOutputStream("C:\\Users\\pahle\\IdeaProjects\\JavaCoreEpamUpSkill\\src\\chapters\\chapter_22\\file_output_stream\\file2.txt")) {
            //write to first file
            for (int i = 0; i < buf.length; i += 2) {
                f.write(buf[i]);
            }
            //write to second file
            f1.write(buf);

            //write to third file
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }
    }
}