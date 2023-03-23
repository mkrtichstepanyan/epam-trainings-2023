package homework_11.TatevKocharyan.homework.myExamples;

import java.io.*;

public class InputOutputExample {
    public static void main(String[] args) {
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream=null;

        try {
            inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\Herbert_Schildt_-_Java_The_Complete_Reference_Eleventh_Edition_11_2019 (1).pdf"));
            outputStream= new BufferedOutputStream(new FileOutputStream("C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\Herbert_Schildt_-_Java_The_Complete_Reference_Eleventh_Edition_11_2019 (2).pdf"));
            int read;
            while ((read = inputStream.read()) != -1) {
                outputStream.write(read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if(inputStream!=null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            if(inputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }

        }
    }
}