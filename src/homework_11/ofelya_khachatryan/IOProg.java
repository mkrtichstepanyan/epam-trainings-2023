package homework_11.ofelya_khachatryan;

import java.io.*;

public class IOProg implements FilenameFilter {
    public String readFile(String fileName) throws IOException {
        BufferedReader inputStream = null;
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            inputStream = new BufferedReader(new FileReader(fileName));
            while ((line = inputStream.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println("An ERROR occurred during reading the file, " + e);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return stringBuilder.toString();
    }

    public void writeFile(String fileName, String data) throws IOException {
        BufferedWriter outputStream = null;

        try {
            outputStream = new BufferedWriter(new FileWriter(fileName));
            outputStream.write(data);
        } catch (IOException e) {
            throw new IOException("An ERROR occurred during writing the file", e);
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".json") || name.endsWith(".csv") || name.endsWith(".txt");
    }
}
