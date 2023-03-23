package homework_13.garik_gharibyan.search;

import java.io.File;

public class Main {

    public static void main(String[] args) {


        File[] files = FileSearcher.searchFiles("*copy*", "src/homework_13/garik_gharibyan/search/");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
