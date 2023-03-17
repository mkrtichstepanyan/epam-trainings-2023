package homework_13.Qnarik_Khachatryan.search;

import java.io.File;

public class Main {

    //TODO: *Book* is not working, please fix
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Conan*", "src/homework_13/Qnarik_Khachatryan" +
                "/search/test_package/");
        for (File file : files) {
            if (file != null){
                System.out.println(file.getName());
            }
        }
    }
}
