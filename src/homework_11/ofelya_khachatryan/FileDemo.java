package homework_11.ofelya_khachatryan;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        IOProg programm = new IOProg();

        String fileName1 = "src/homework_11/ofelya_khachatryan/input.txt";
        String fileName2 = "src/homework_11/ofelya_khachatryan/output.txt";

        try {
            String reading = programm.readFile(fileName1);
            String processing = programm.processData(reading);
            programm.writeFile(fileName2, processing);
            System.out.println("Data is processed, modified and saved to " + fileName2 + ".");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}