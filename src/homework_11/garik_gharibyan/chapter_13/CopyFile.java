package homework_11.garik_gharibyan.chapter_13;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {

        File readFile = new File("src/homework_11/garik_gharibyan/chapter_13/read.txt");
        File writeFile = new File("src/homework_11/garik_gharibyan/chapter_13/write.txt");
        File[] files = new File[]{readFile,writeFile};
        int i;
        FileInputStream fio = null;
        FileOutputStream fou = null;
            try {
                fio = new FileInputStream(files[0]);
                fou = new FileOutputStream(files[1]);
                    i = fio.read();
                    while (i != -1){
                        fou.write(i);
                        i = fio.read();
                    }

            } catch (IOException e) {
                System.out.println(e);
            }
            finally {
                if (fio != null){
                    try {
                        fio.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    if (fou!= null){
                        try {
                            fou.close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }

    }
}
