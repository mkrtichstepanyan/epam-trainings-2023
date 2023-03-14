package homework_11.garik_gharibyan.chapter_22.file;

import java.io.File;
import java.lang.reflect.Field;

public class DirList {
    public static void main(String[] args) {
        String dirName = "src/homework_11/garik_gharibyan";
        File file = new File(dirName);

        if (file.isDirectory()){
            System.out.println("Directory of " + dirName);
            String[] list = file.list();

            for (int i = 0; i < list.length; i++) {
                File file1 = new File(dirName +"/" + list[i]);
                if (file1.isDirectory()){
                    System.out.println(file1 + " is directory");
                }else {
                    System.out.println(file1 + " is file");
                }
            }
        }else {
            System.out.println(file + " is mot directory");
        }
    }
}
