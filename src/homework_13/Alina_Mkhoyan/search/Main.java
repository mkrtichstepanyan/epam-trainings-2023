package homework_13.Alina_Mkhoyan.search;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Java*", "C:\\Users\\Lenovo\\OneDrive\\Рабочий стол\\JAVA");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}