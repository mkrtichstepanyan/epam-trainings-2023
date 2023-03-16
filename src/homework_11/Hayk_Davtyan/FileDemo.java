package homework_11.Hayk_Davtyan;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\ASUS\\Desktop\\homefile.txt");
        System.out.println(f1.getName());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getParent());
        System.out.println(f1.canWrite());
        System.out.println(f1.canRead());
        System.out.println(f1.isFile());
        System.out.println(f1.isDirectory());
        System.out.println(f1.length());
    }
}
