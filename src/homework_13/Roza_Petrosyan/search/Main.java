package homework_13.Roza_Petrosyan.search;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix

    //copycopycopy.txt "*copy*"
    // "copy*"
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*copy*", "src/homework_13/Roza_Petrosyan/search/");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
