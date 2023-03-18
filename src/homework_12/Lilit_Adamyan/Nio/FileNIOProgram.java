package homework_12.Lilit_Adamyan.Nio;

import java.io.IOError;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNIOProgram {
    public static String readFile(String fileName) throws IOException {
        String data = "";
        try {
            Path path = Paths.get(fileName);
            byte[] fileBytes = Files.readAllBytes(path);
            data = new String(fileBytes, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IOException("An error occurred while reading the file.", e);
        }

        return data;
    }
    public static void writeFile(String fileName,String data)throws IOException{
        try{
            Path path =Paths.get(fileName);
            byte[] dataBytes = data.getBytes(StandardCharsets.UTF_8);
            Files.write(path,dataBytes);
        }catch (IOException e){
            throw new IOException("An error occurred while reading the file.",e);
        }
    }
    public static String processData(String data) {
        return data.toUpperCase();
    }
    public static void main(String[] args) {
        String fileName = "input.txt";
        String newFileName = "output.txt";

        try {
            String fileContent = readFile(fileName);
            String processContent = processData(fileContent);
            writeFile(newFileName, processContent);
            System.out.println("File processing successful. Modified data saved to " + newFileName + ".");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            System.exit(0);
        }
    }
}
