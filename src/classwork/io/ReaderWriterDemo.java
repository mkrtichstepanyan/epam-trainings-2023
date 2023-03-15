package classwork.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class ReaderWriterDemo {

    // InputStream, OutputStream, Reader, Writer


    public static void main(String[] args) {
        String fileToReadPath = "/Users/Levon_Aloyan/Documents/iodemo/test.txt";
        String fileToWritePath = "/Users/Levon_Aloyan/Documents/iodemo/NewWriter.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToReadPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWritePath))) {
            String data;
            while ((data = reader.readLine()) != null) {
                writer.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File not found: %s", fileToReadPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
