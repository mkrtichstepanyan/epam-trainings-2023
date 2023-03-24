package homework_11.garik_gharibyan.chapter_22.file;

import java.io.File;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File file = new File("src/homework_11/garik_gharibyan/chapter_22/file/COPYRIGHT");
        p("file name: " + file.getName());
        p("Path: " + file.getPath());
        p("Abs Path: " + file.getAbsolutePath());
        p("Parent: " + file.getParent());
        p(file.exists() ? "exists" : "does not exist");
        p(file.canWrite() ? "is writable" : "is not writable");
        p(file.canRead() ? "is readable" : "is not readable");
        p(file.isDirectory() ? "is directory" : "is not directory");
        p(file.isFile() ? "is normal file" : "might be a named pipe");
        p(file.isAbsolute() ? "is absolute" : "is not absolute");
        p("file last modified: " + file.lastModified());
        p("file size: " + file.length() + " bytes");


    }
}
