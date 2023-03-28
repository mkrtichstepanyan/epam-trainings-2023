package homework_11.Hayk_Davtyan;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FilenameFilter;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "nksncdhchekjcenxdnxuchuche";
        byte[] b = tmp.getBytes();
        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream INPUT2 = new ByteArrayInputStream(b,0,3);
    }

    public static class DirListOnly {
        public static void main(String[] args) {
            String dirname = "C:\\Users\\ASUS\\Desktop\\homedir";
            File f1 = new File(dirname);
            FilenameFilter only = new OnlyExt("html");
            String[] s = f1.list(only);

            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        }
    }

    public static class OnlyExt implements FilenameFilter {
    String ext;
    public OnlyExt(String ext){
        this.ext = "." + ext;
    }
        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }
}
