package homework_13.anna_manukyan.search;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File[] files = FileSearcher.searchFiles("*test1*", "src\\homework_13\\anna_manukyan\\search");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
