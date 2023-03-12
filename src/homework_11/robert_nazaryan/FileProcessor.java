package homework_11.robert_nazaryan;

import java.io.*;

public class FileProcessor {

    public String readFile(String fileName) {
        String data ="";

        if (isValidFileFormat(fileName)) {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String s;
                while ((s = reader.readLine()) != null) {
                    data += s + "\n";
                }

            } catch (FileNotFoundException e) {
                System.out.println(fileName + ": not found");
            } catch (IOException e) {
                System.out.println("Can't read this file");
            }
        } else {
            System.out.println("Wrong format");
        }
        return data;
    }

    public void writeFile(String fileName, String data) {
        if (isValidFileFormat(fileName)) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(data);
            } catch (IOException e) {
                System.out.println("Cant't write in this file");
            }
        } else {
            System.out.println("Wrong format");
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    private boolean isValidFileFormat(String fileName) {
        if (fileName.endsWith(".txt") || fileName.endsWith(".csv") || fileName.endsWith(".json")) {
            return true;
        }
        return false;
    }
}
