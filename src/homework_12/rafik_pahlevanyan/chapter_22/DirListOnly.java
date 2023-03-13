package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "/D:/javaexample/";
        File file = new File(dirName);
        FilenameFilter only = new OnlyExt("html");
        String[] s = file.list(only);

        for (String value : s) {
            System.out.println(value);
        }
    }
}
