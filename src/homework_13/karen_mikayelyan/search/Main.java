package homework_13.karen_mikayelyan.search;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*searchTest*", "C:\\Users\\Admin\\IdeaProjects\\RD\\epam-trainings-2023\\src\\homework_13\\karen_mikayelyan\\search");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
