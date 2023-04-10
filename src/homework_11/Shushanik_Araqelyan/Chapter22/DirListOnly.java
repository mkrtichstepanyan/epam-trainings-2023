package homework_11.Shushanik_Araqelyan.Chapter22;

import java.io.FilenameFilter;
import java.io.*;
public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list(only);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s [i]);

        }
    }
}
