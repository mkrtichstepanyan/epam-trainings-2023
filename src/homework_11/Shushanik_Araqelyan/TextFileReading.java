package homework_11.Shushanik_Araqelyan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TextFileReading {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("MyFile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
