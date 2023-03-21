package homework_13.Varsik_Pijoyan.searcher;

import java.io.File;

public class Main {
    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*test*", "/src/Varsik_Pijoyan/searcher/");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
