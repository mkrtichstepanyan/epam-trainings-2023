package homework_11.Roza_Petrosyan.task.assignment_one.input_output;

import homework_11.Roza_Petrosyan.task.assignment_one.exception.FileExtensionException;
import java.io.*;

public class ReadAndWriteFile implements FilenameFilter{
    public String readFile(String fileName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (isAllowedFileExtension(fileName)) {
            String line;
            try (BufferedReader fr = new BufferedReader(new FileReader(fileName))) {
                while ((line = fr.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            }
        } else {
            throw new FileExtensionException();
        }
        return stringBuilder.toString();
    }

    public void writeFile(String fileName, String data) {
        char[] buf = new char[data.length()];
        data.getChars(0, data.length(), buf, 0);
        if (isAllowedFileExtension(fileName)) {
            try (BufferedWriter fw = new BufferedWriter(new FileWriter(fileName))) {
                for (char c : buf) {
                    fw.write(c);
                }
            } catch (IOException e) {
                System.out.println("An I/O error occurred: " + e.getMessage());
            }
        } else {
            throw new FileExtensionException();
        }
    }

    public String processData(String data) {
        return data != null ? data.toUpperCase() : "";
    }

    private boolean isAllowedFileExtension(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf("."));
        return extension.equals(".json") || extension.equals(".csv") || extension.equals(".txt");
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".json") || name.endsWith(".csv") || name.endsWith(".txt");
    }
}
