package homework_11.Roza_Petrosyan.chapter_22.filter;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "/java";
        File f1 = new File(dirName);

        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list(only);

        if (s != null) {
            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }
}
