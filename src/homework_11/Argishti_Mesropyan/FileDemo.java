package homework_11.Argishti_Mesropyan;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        IoProgram program = new IoProgram();

        String file1 = "src/homework_11/Argishti_Mesropyan/test.txt";
        String file2 = "src/homework_11/Argishti_Mesropyan/test1.txt";


        try {
            String reading = program.readFile(file1);
            String processing = program.processData(reading);
            program.writeFile(file2, processing);
            System.out.println("Data is processed, modified and saved to" + file2 + " .");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
