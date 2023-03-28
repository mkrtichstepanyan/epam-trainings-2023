package homework_11.Hayk_Davtyan;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\ASUS\\Desktop\\homedir";
        File file = new File(dirname);

        if (file.isDirectory()){
            System.out.println(dirname);
            String[] s = file.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i] + " - directory");
                }
                else {
                    System.out.println(s[i] + " - file");
                }

            }
        }
    }
}
