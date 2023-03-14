package homework_11.garik_gharibyan.chapter_13;

import java.io.*;

public class CopyFileARM {
    public static void main(String[] args) {
        File readFile = new File("src/homework_11/garik_gharibyan/chapter_13/read.txt");
        File writeFile = new File("src/homework_11/garik_gharibyan/chapter_13/write.txt");
        File[] files = new File[]{readFile, writeFile};

        int i;

        try (FileInputStream fio = new FileInputStream(files[0]);
             FileOutputStream foe = new FileOutputStream(files[1])) {

            do {
                i = fio.read();
                if (i != -1) {
                    foe.write(i);
                }
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
