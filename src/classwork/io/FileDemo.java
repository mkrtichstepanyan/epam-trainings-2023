package classwork.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo {

    // InputStream, OutputStream, Reader, Writer


    public static void main(String[] args)  {
        String fileToReadPath = "/Users/Levon_Aloyan/Downloads/LI Innovation Camp.mp4";
        String fileToWritePath = "/Users/Levon_Aloyan/Documents/iodemo/newVideoFile.mp4";
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        try {
            int data;
            inputStream = new BufferedInputStream(new FileInputStream(fileToReadPath));
            outputStream = new BufferedOutputStream(new FileOutputStream(fileToWritePath));

            while ((data = inputStream.read()) != -1){
                outputStream.write(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(String.format("File not found: %s",fileToReadPath));
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
