package homework_11.TatevKocharyan.homework.myExamples;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Objects;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\text.txt");
        System.out.println(file.getName());
        if (file.isDirectory()) {
            for (File file1 : file.listFiles()) {
                System.out.println(file1.getPath());
            }
        }

        boolean newFile = false;
        try {
            newFile = file.createNewFile();
            if (newFile) {
                System.out.println("Created");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage() + "Faild to create");
        }
    }
}
