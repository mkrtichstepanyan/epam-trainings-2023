package homework_11.Qnarik_Khachatryan.chapter_22;

//Demonstrate FileWriter

import java.io.FileWriter;
import java.io.IOException;

class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Now is the time for all good men to come to the aid of their country and ay their due taxes.";
        char[] buffer = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try (FileWriter f0 = new FileWriter("src/homework_11/Qnarik_Khachatryan/chapter_22/files/file111.txt");
             FileWriter f1 = new FileWriter("src/homework_11/Qnarik_Khachatryan/chapter_22/files/file222.txt");
             FileWriter f2 = new FileWriter("src/homework_11/Qnarik_Khachatryan/chapter_22/files/file333.txt")) {
            // write to first file
            for (int i = 0; i < buffer.length; i += 2) {
                f0.write(buffer[i]);
            }

            // write to second file
            f1.write(buffer);

            //write to third file
            f2.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);

        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
        }

    }
}
