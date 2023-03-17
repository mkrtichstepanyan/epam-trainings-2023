package homework_13.gohar_hakobyan.search;

import java.io.File;

public class Main {
    private static final String DIRECTORY = "C:\\Users\\Noname\\Desktop\\EPAM2023\\epam-trainings-2023\\src\\homework_13\\gohar_hakobyan\\search";


    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*test*", DIRECTORY);
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
