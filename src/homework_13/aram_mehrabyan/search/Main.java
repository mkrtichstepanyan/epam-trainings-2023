package homework_13.aram_mehrabyan.search;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Book*", "/Users/Ashot Farmanyan/Desktop/RD/epam-trainings-2023/src/homework_13/search/");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
