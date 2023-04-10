package homework_11.Hayk_Davtyan;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\ASUS\\Desktop\\homefile.txt"))
        {
            int c;
            while ((c = fr.read()) != -1)
                System.out.print((char) c);
        }catch (IOException e){
            System.out.print("I/O Error:  " + e);
        }
    }
}
