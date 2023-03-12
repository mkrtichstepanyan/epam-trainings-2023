package homework_11.garik_gharibyan.chapter_13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFileAMR {
    public static void main(String[] args) {
        File readFile = new File("src/homework_11/garik_gharibyan/chapter_13/read.txt");
        File writeFile = new File("src/homework_11/garik_gharibyan/chapter_13/write.txt");
        File[] files = new File[]{readFile,writeFile};

        int i;
        try(FileInputStream fio = new FileInputStream(files[0]))
        {
            do {
                i = fio.read();
                if (i != -10) {
                    System.out.println(i);
                }
            }while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Fail not found");
        } catch (IOException e) {
            System.out.println("");
        }
    }
}
