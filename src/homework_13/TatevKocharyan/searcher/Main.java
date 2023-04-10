package homework_13.TatevKocharyan.searcher;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {

        File [] files=FileSearcher.searchFiles( "*text",
                "C:\\Users\\Lenovo\\Desktop\\java");

        for (File file : files) {
            if (file!=null){
                System.out.println(file.getName());
            }
        }



    }
}

