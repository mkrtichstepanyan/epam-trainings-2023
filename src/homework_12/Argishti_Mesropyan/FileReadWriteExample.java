package homework_12.Argishti_Mesropyan;
import java.io.*;
public class FileReadWriteExample {
    public static void main(String[] args) {
        try {
            // create a file object
            String file = String.valueOf(new File("src/homework_12/Argishti_Mesropyan/test.txt"));

            // create a file writer object
            FileWriter writer = new FileWriter(file);
            // write some text to the file

            writer.write("Hello, World!\n");
            writer.write("This is a test file.\n");

            // close the writer
            writer.close();

            // create a file reader object
            FileReader reader = new FileReader(file);

            // read the contents of the file
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }

            // close the reader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

