package homework_11.Qnarik_Khachatryan.chapter_22;


import java.io.File;
import java.io.FilenameFilter;

//Directory of .HTML files.
class DirListOnly {
    public static void main(String[] args) {
        String dirname = "src/homework_11/Qnarik_Khachatryan/chapter_22/files";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String[] s = f1.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
