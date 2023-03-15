package homework_11.Anush_Ananyan.Assignment_1;

import java.io.*;

public class ReadAndWriteFile implements FilenameFilter {
    public String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader fileR = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileR.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("The file doesn't exist");
        } catch (IOException e) {
            System.out.println("Error during reading the file " + fileName);
        }
        return stringBuilder.toString();
    }

    public void writeFile(String fileName, String data) {
        try (BufferedWriter fileW = new BufferedWriter(new FileWriter(fileName))) {
            fileW.write(data);
        } catch (IOException e) {
            System.out.println("Error during writing the file " + fileName);
        }
    }

    public String processData(String data) {
        return data.toUpperCase();
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".json") || name.endsWith(".txt") || name.endsWith("cvs");
    }
}
