package homework_13.araksya_ghazaryan.search;


import java.io.File;

public class Main {

    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Book*", "/Users/Araksya/Documents/iodemo");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}