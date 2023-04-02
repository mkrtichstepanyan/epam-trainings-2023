package homework_11.Vahe_Vardanyan;
import java.io.*;

public class FileProcessor {
    public static String readFile(String fileName){
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")){
            StringBuilder data = new StringBuilder();
            try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null){
                    data.append(line).append("\n");
                }
            }catch (FileNotFoundException e){
                System.err.println("The File doesn`t found!");
                System.exit(0);
            }catch (IOException e){
                System.out.println("Error An error occurred while reading file" + fileName);
                System.exit(0);
            }
            return data.toString();
        }else return "Unsupported file format";
    }
    public static void writeFile(String filename, String data){
        if (filename.endsWith(".txt") || filename.endsWith(".csv") || filename.endsWith(".json")){
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
                bw.write(data);
                System.out.println("The data are successfully written!");
            }catch (IOException e){
                System.err.println("Error: An error occurred while writing into file " + filename);
                System.exit(0);
            }
        }else {
            System.err.println("The data format is wrong!!!");
        }
    }
    public static String processData(String data){
        return data.toUpperCase();
    }
}
