package homework_11.Diana_Melkonyan;

import java.io.*;

public class Process {

    public static String readFile(String fileName) {
        String data = null;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line=br.readLine()) !=null){
                sb.append(line).append(System.lineSeparator());

            }
            data=sb.toString();

        } catch (FileNotFoundException e ){
            System.out.println( "Error read " + fileName);
        }
        catch (IOException e) {
            System.out.println("Error read " + fileName);
        }
        return data;
    }

 public static void writeFile(String fileName, String data){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            bw.write(data);
        }catch (IOException e ){
            System.out.println("Error write " + fileName);
        }
 }
    public static String processData(String data){
        return data.toUpperCase();
    }
}
