package homework_12.rafik_pahlevanyan.chapter_22;

import java.io.File;

//Demonstrate File
public class FileDemo {
    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File file = new File("/D:/javaexample/example.txt");

        p("File name: " + file.getName());
        p("path: " + file.getPath());
        p("Abs path: " + file.getAbsolutePath());
        p("parent: " + file.getParent());
        p(file.exists() ? "exists" : "does not exist");
        p(file.canWrite() ? "is writeable" : "is not writeable");
        p(file.canRead() ? "is readable" : "is not readable");
        p("is" + (file.isDirectory() ? "" : "not" + " a directory"));
        p(file.isFile() ? "is normal file" : "might be a named pipe");
        p(file.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + file.lastModified());
        p("File size: " + file.length() + " Bytes");
    }
}
