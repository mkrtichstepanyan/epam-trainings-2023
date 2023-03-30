package homework_12.TatevKocharyan.chapter22;

import java.io.File;

public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        File f1 = new File("/java/COPYRIGHT");
        p("File Name: " + f1.getName());
        p("Path: " + f1.getPath());
        p("Parent: " + f1.getParent());
        p(f1.exists() ? "exists" : "does not exist");
        p(f1.canWrite() ? "is writeable" : "is not writeable");
        p(f1.canRead() ? "is readable" : "is not readable");
        p("is " + (f1.isDirectory() ? "" : "not " + "a directory"));
        p(f1.isFile() ? "is normal file" : "is not absolute");
        p("file last modified:" + f1.lastModified());
        p("file size: " + f1.length() + " Bytes");
    }
}