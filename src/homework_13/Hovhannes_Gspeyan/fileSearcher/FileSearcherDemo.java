package homework_13.Hovhannes_Gspeyan.fileSearcher;

import java.io.File;

public class FileSearcherDemo {

    private static final String DIRECTORY = "C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\src\\homework_13\\Hovhannes_Gspeyan\\fileSearcher";

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[]files = FileSearcher.searchFiles("*testSearch*",DIRECTORY);
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
