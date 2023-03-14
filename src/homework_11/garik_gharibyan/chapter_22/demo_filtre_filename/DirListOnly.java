package homework_11.garik_gharibyan.chapter_22.demo_filtre_filename;

import homework_11.Roza_Petrosyan.chapter_22.pushback_input_stream.PushBackInputStreamDemo;

import java.io.*;

public class DirListOnly {
    public static void main(String[] args) {
        String dirName = "src/homework_11/garik_gharibyan/chapter_22/demo_filtre_filename/fff.txt";
        File file = new File(dirName);

        if (file.isDirectory()){
            System.out.println("is directory");
            String[] htmls = file.list(new OnlyExt("html"));

            for (String str : htmls) {
                System.out.println(str);
            }
        }
    }
}
