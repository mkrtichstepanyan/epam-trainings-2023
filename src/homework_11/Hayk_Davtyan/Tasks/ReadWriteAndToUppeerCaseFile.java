package homework_11.Hayk_Davtyan.Tasks;

import java.io.*;

public class ReadWriteAndToUppeerCaseFile {
    public static void main(String[] args) {
       readFile("src/homework_11/Hayk_Davtyan/Tasks/homefile.txt");
        writeFile("src/homework_11/Hayk_Davtyan/Tasks/homefile.txt","Hello");
        processData("src/homework_11/Hayk_Davtyan/Tasks/homefile.txt");
    }
public static String readFile(String fileName){

        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String c;
            while ((c = br.readLine()) != null)
                System.out.print((String) c);
        }catch (IOException e){
            System.out.print("I/O Error:  " + e);
        }
        return "0";
    }

    public static void writeFile(String fileName, String data){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.write(data);
        }catch (IOException e ){
            System.out.println("I/O Error: " + fileName);
        }
    }
  public static   String processData(String data){
        return data.toUpperCase();
    }
}
