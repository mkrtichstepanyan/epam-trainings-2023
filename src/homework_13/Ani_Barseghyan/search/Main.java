package homework_13.Ani_Barseghyan.search;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*Conan*", "C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_13\\Ani_Barseghyan\\testDirectory");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
