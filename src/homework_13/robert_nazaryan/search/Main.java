package homework_13.robert_nazaryan.search;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Book*", "/Users/Levon_Aloyan/Documents/iodemo");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
