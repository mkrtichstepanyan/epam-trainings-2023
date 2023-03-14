package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.File;

//Using directories
public class DirList {
    public static void main(String[] args) {
        String dirName = "/D:/javaexample/";
        File file = new File(dirName);
        if (file.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String[] s = file.list();

            for (String value : s) {
                File file1 = new File(dirName + "/" + value);
                if (file1.isDirectory()) {
                    System.out.println(value + " is directory");
                } else {
                    System.out.println(value + " is file");
                }
            }
        } else {
            System.out.println(dirName + " is not directory☻");
        }
    }
}
