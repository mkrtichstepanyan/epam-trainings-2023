package Vladimir_Vanyan.Search;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] files = FileSearch.searchFiles("*11*.txt", "/D:/javaexample");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
