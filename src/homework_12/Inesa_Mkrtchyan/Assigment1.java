package homework_12.Inesa_Mkrtchyan;

import java.io.*;

public class Assigment1 {
    public static void main(String[] args) {
        String File = "src\\homework_12\\Inesa_Mkrtchyan\\Text.txt";
        String JsonFile = "src\\homework_12\\Inesa_Mkrtchyan\\Test.json";
        String inputText = readFile(JsonFile);
        String modifiedData = processData(inputText);
        writeFile(JsonFile, modifiedData );

    }

    public static String readFile(String fileName) {
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

    public static void writeFile(String fileName, String data) {
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
        if(fileName == "csv" || fileName == "txt" || fileName == "json"){
            return true;
        }
        return false;
    }
}
