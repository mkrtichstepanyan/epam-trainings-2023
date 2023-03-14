package homework_10.gevorg_arghushyan;

import java.io.*;

public class FileIOExample {

    private static final String INPUT = "C:\\Users\\HP\\IdeaProjects\\epam-trainings-2023\\src\\homework_10\\gevorg_arghushyan\\input.txt";
    private static final String OUTPUT = "C:\\Users\\HP\\IdeaProjects\\epam-trainings-2023\\src\\homework_10\\gevorg_arghushyan\\output.txt";

    public static void main(String[] args) {


        try {
            String data = readFile(INPUT);
            String processedData = processData(data);
            writeFile(OUTPUT, processedData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading or writing file: " + e.getMessage());
        }
    }

    public static String readFile(String fileName) throws IOException {
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!fileExtension.equals("txt") && !fileExtension.equals("csv") && !fileExtension.equals("json")) {
            throw new IOException("Unsupported file format.");
        }

        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n");
        }
        br.close();

        return sb.toString();
    }

    public static void writeFile(String fileName, String data) throws IOException {
        String fileExtension = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!fileExtension.equals("txt") && !fileExtension.equals("csv") && !fileExtension.equals("json")) {
            throw new IOException("Unsupported file format.");
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(data);
        bw.close();
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

}
