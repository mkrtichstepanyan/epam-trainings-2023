package homework_11.Lilit_Adamyan.Assignment_1;

import java.io.*;

public class FileIOProgram {
    public static String readFile(String fileName) throws IOException {

        BufferedReader reader = null;
        String line;
        String data = "";

        try {
            reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                data += line + "\n";
            }
        } catch (IOException e) {
            throw new IOException("An error occurred while reading the file,", e);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return data;
    }

    public static void writeFile(String  fileName,String data)throws IOException{
        BufferedWriter writer= null;

        try{
            writer= new BufferedWriter(new FileWriter(fileName));
            writer.write(data);
        }catch (IOException e){
            throw new IOException("An error occurred while writing to the file.", e);

        }finally {
            if(writer!=null){
                writer.close();
            }
        }
    }
    public static String processData(String data){
        return data.toUpperCase();
    }
    public static void main(String[] args) {
        String fileName = "input.txt";
        String newFileName = "output.txt";

        try{
            String fileContent = readFile(fileName);
            String processContent = processData(fileContent);
            writeFile(newFileName,processContent);
            System.out.println("File processing successful. Modified data saved to " + newFileName + ".");

        }catch (IOException e){
            System.out.println("An error occured: "+ e.getMessage());
            System.exit(0);
        }
    }
}

