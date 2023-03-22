package homework_13.Nona_Asatryan.search;

import java.io.File;

public class FileSearcherDemo {

    private static final String DIRECTORY = "/Users/nona.asatryan/epam-trainings-2023/src/homework_13/Nona_Asatryan/search";

    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*test*",DIRECTORY);
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
