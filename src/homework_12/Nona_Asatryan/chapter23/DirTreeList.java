package homework_12.Nona_Asatryan.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirTreeList {
    public static void main(String[] args) {

        String dirName = "/Users/nona.asatryan/epam-trainings-2023/src/homework_12/Nona_Asatryan/chapter23";
        System.out.println("Directory tree starting with " + dirName + ":\n");
        try {
            Files.walkFileTree(Path.of(dirName), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("I/O error");
        }
    }
}
