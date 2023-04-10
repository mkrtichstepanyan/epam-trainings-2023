package homework_12.Inesa_Mkrtchyan;

import java.io.*;
import java.util.Objects;

public class Assigment1 {
    public static void main(String[] args) throws Exception {
        String file = "src\\homework_12\\Inesa_Mkrtchyan\\Text.txt";
        String jsonFile = "src\\homework_12\\Inesa_Mkrtchyan\\Test.json";
        String inputText = readFile(jsonFile);
        String modifiedData = processData(inputText);
        writeFile(jsonFile, modifiedData );

    }

    public static String readFile(String fileName) throws Exception {
        if(!isValidFile(fileName)) {
            throw new Exception("File name is not valid!! \n I can work only with json csv or txt files");
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error reading file! \n " + fileName + " file is not found");
        }
        return sb.toString();
    }

    public static void writeFile(String fileName, String data) throws Exception {
        if(!isValidFile(fileName)) {
            throw new Exception("File name is not valid \n I can work only with json csv or txt files");
        }
        try {
            //String dataForFile = readFile(fileName) + data;
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(data);
            //bw.write(dataForFile);//add in file
            bw.close();
        } catch (IOException e) {
            System.err.println("Error writing file: \n" + fileName + " file is not found");
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }
    private static boolean isValidFile(String fileName) {
        return fileName.contains("csv") || fileName.contains("txt") || fileName.contains("json");
    }
}
