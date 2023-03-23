package homework_13.ofelya_khachatryan.searcher;

import java.io.File;

public class SearcherTest {
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*book*", "C:\\Users\\Ofelya\\Desktop\\RD\\epam-trainings-2023\\src\\homework_13\\ofelya_khachatryan\\searcher");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
