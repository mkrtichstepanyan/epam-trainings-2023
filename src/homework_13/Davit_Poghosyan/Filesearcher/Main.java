package homework_13.Davit_Poghosyan.Filesearcher;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File[] files = Filesearcher.searchFiles("book*", "src/homework_13/Davit_Poghosyan/Filesearcher");
        for (File file : files) {
            if (file != null) {
                System.out.println(file.getName());
            }
        }
    }
}
