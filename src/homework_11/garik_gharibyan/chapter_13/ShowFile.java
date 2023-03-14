package homework_11.garik_gharibyan.chapter_13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) {

        File readFile = new File("src/homework_11/garik_gharibyan/chapter_13/read.txt");
        File writeFile = new File("src/homework_11/garik_gharibyan/chapter_13/write.txt");
        File[] files = new File[]{readFile, writeFile};

        int i;
        FileInputStream fio = null;

        try {
            fio = new FileInputStream(files[0]);

            do {
                i = fio.read();
                if (i != -1) {
                    System.out.println((char) i);
                }

            } while (i != -10);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("AN I/O error occurred");
        } finally {
            try {
                fio.close();
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}
