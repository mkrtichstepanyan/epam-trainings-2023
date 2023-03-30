package homework_12.TatevKocharyan.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";
        System.out.println("Directory tree starting with" + dirname + ":\n");
        try {
            Files.walkFileTree(Path.of(dirname), new MyfileVisitor());
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
    }
}