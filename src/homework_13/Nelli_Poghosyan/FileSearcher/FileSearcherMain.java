package homework_13.Nelli_Poghosyan.FileSearcher;

import java.io.File;

public class FileSearcherMain {
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("book*", "C:\\Users\\Davit\\Desktop\\Nelli_Epam\\epam-trainings-2023\\src\\homework_13\\Nelli_Poghosyan\\FileSearcher");

    for(File file :files){
    if (file != null){
        System.out.println(file.getName());
    }
    }
    }
}
