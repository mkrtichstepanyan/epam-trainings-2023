package homework_13.Radik_Manasyan.search;

import java.io.File;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<File> files = FileSearcher.searchFiles("*Conan*", "src/homework_13/Radik_Manasyan/files");

        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
