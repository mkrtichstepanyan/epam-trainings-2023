package homework_11.gohar_hakobyan;

import java.io.*;

public class FileUtil implements FilenameFilter {

    public static final String FILE_PATH = "C:\\Users\\Noname\\Desktop\\EPAM2023\\epam-trainings-2023\\src\\homework_11\\gohar_hakobyan\\file\\file.txt";

    public static String readFile(String fileName) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading file " + fileName);
            System.exit(0);
        }
        return stringBuilder.toString();
    }

    public static void writeFile(String filename, String data) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write(data);
            System.out.println("The data are successfully written.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while writing to file " + filename);
            System.exit(0);
        }
    }

    // Takes the data as input and  returns the modified data
    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void fileChecker(File file) {
        if (!(file.isFile() && file.exists())) {
            System.out.println("Error: File doesn't exist.");
        }
    }

    @Override
    public boolean accept(File file, String name) {
        return file.getName().endsWith(".txt") || !file.getName().endsWith(".csv")
                || !file.getName().endsWith(".json");
    }
}
