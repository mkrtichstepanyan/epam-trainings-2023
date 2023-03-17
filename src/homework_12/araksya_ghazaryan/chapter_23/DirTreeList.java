package homework_12.araksya_ghazaryan.chapter_23;

import homework_12.araksya_ghazaryan.chapter_23.MyFilleVisitor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirTreeList {
    public static void main(String[] args) {
        String dirName ="/home/araksya/Rd_Epam/epam-trainings-2023/src/homework_12/araksya_ghazaryan/chapter_23";
        System.out.println("Directory tree starting with " + dirName + ":\n");
        try {
            Files.walkFileTree(Path.of(dirName), new MyFilleVisitor());
        } catch (IOException e) {
            System.out.println("I/O error");
        }
    }
}