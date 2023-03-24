package homework_11.Shushanik_Araqelyan;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriting {
    public static void main(String[] args) {
        try{
            FileWriter writer= new FileWriter("MyFile.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("Nice to meet you!");
                    bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
