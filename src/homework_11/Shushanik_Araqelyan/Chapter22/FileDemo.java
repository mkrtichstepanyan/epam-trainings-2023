package homework_11.Shushanik_Araqelyan.Chapter22;
import java.io.*;
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("File Name: " + f1.getName());
        p("Path:" + f1.getAbsolutePath());
        p("Parent:" + f1.getParent());
        p(f1.exists() ? "exists" : "does not exists");
        p(f1.canWrite () ? "is writable": "is not writeable");
        p(f1.canRead() ? " is readable" : "is not readable");
        p("is" + (f1.isDirectory() ? "" : "not" + "a directory"));
        p(f1.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified:" + f1.lastModified());
        p("File size:" + f1.length() + "Bytes");

    }
}
