package homework_12.Radik_Manasyan.chapter21;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "/";
        File f1 = new File(dirName);
        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
