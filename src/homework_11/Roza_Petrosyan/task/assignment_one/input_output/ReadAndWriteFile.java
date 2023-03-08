package homework_11.Roza_Petrosyan.task.assignment_one.input_output;

import homework_11.Roza_Petrosyan.task.assignment_one.exception.FileExtensionException;

import java.io.*;

public class ReadAndWriteFile {
    public String readFile(String fileName) {

        String data = "";
        String line;
        if (isFileExtension(fileName)) {
            try (BufferedReader fr = new BufferedReader(new java.io.FileReader(fileName))) {
                while ((line = fr.readLine()) != null) {
                    data += line + "\n";
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            } catch (IOException e) {
                System.out.println("I/O Error: " + e);
            }
        } else {
            throw new FileExtensionException();
        }


        return data;
    }

    public void writeFile(String fileName, String data) {

        char[] buf = new char[data.length()];
        data.getChars(0, data.length(), buf, 0);

        if (isFileExtension(fileName)) {

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
        String result = "";
        if (data != null) {
            result = data.toUpperCase();
        }
        return result;
    }

    private boolean isFileExtension(String fileName) {
        boolean result = false;
        String extension = fileName.substring(fileName.lastIndexOf("."));

        if (extension.equals(".json") || extension.equals(".csv") || extension.equals(".txt")) {
            result = true;
        }

        return result;
    }
}
