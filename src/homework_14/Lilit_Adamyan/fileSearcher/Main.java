package homework_14.Lilit_Adamyan.fileSearcher;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("test*", "/Users/Admin/Desktop/IOdemo");
        for(File file : files){
            if(file!= null){
                System.out.println(file.getName());
            }
        }
    }
}
