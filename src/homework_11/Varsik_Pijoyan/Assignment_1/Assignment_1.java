package homework_11.Varsik_Pijoyan.Assignment_1;

import java.io.*;

public class Assignment_1 {
    public static final String FILE = "src\\homework_11\\Varsik_Pijoyan\\files\\test/txt";

    public static String readFile(String fileName) throws IOException{
        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }
        }  catch (IOException e) {
            System.err.println("Error reading file: " + fileName);
            System.exit(0);
        }
        return stringBuilder.toString();
    }


    public static void writeFile(String fileName, String data) {
        File file = new File(fileName);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + fileName);
            System.exit(1);
        }
    }


    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void fileChecker(File file) {
        if (!(file.isFile() && file.exists())) {
            System.out.println("Error: File doesn't exist.");
        } else if (!file.getName().endsWith(".txt") && !file.getName().endsWith(".csv")
                && !file.getName().endsWith(".json")) {
            System.out.println("Unsupported file format.");
        }
    }
}
