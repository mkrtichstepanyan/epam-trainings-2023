package homework_11.aram_mehrabyan;

import java.io.*;

public class FileDemo {

    public static String readFile(String filename) {
        String data=null;

           String path = "/Users/PC/Desktop/RD/epam-trainings-2023/src/homework_11/aram_mehrabyan/" + filename;
           try( BufferedReader reader = new BufferedReader(new FileReader(path))) {

               StringBuilder sb=new StringBuilder();
               String line=reader.readLine();

               while(line!=null) {
                   sb.append(line);
                   sb.append(System.lineSeparator());
                   line=reader.readLine();
               }
               data=sb.toString();

           } catch (FileNotFoundException e) {
               System.out.println(String.format("File not found: %s", path));

           } catch (IOException e) {
               System.out.println(e);
           }
           return data;

    }
    public static void writeFile(String filename,String data){
        String path = "/Users/PC/Desktop/RD/epam-trainings-2023/src/homework_11/aram_mehrabyan/" + filename;
        try( BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(data);
        }catch (IOException e) {
            System.out.println(String.format("Error occured during write %s",filename));
        }
    }
    static String processData(String data){
        return data.toUpperCase();
    }

    public static void main(String[] args) {
        String filename="f1.txt";
        if (filename.endsWith(".txt")||filename.endsWith(".csv")||filename.endsWith(".json")) {
            String data=readFile(filename);

            writeFile("f2.txt",processData(data));
        }
        else
           System.out.println("Wrong file format!");



    }
}
