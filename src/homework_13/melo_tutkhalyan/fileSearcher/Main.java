package homework_13.melo_tutkhalyan.fileSearcher;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*est*", "C:\\Users\\TOSHIBA\\Desktop\\New Package");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
