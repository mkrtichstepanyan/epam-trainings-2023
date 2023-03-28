package homework_12.Radik_Manasyan.chapter21;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("File name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("File absolute path: " + f1.getAbsolutePath());
        p("Parent catalog: " + f1.getParent());
        p(f1.exists() ? "exist" : "does not exist");
        p(f1.canWrite() ? "can write" : "cant write");
        p(f1.canRead() ? "can read" : "cant read");
        p(f1.isDirectory() ? "is a directory" : "is not a directory");
        p(f1.isFile() ? "Является обычным файлом" :
                "Может быть именованным каналом");
        p("Last modified in to file: " + f1.lastModified());
        p("Size: " + f1.length() + " byte");
    }
}
