package homework_12.Anush_Ananyan.Chapter_23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MYTreeList {
    public static void main(String[] args) {
        String dirname = "D:\\Epam\\Materials";

        System.out.println("Directory tree starting with " +dirname + ":\n");

        try{
            Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
        }catch (IOException e){
            System.out.println("I/O Error");
        }
    }
}
