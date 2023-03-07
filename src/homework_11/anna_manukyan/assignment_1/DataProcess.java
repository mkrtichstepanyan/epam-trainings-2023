package homework_11.anna_manukyan.assignment_1;

import java.io.*;


public class DataProcess {
    private File inputFile;
    private File outputFile;
    private String inputData = "";

    private static final String BASE_PATH = "C:\\Users\\annam\\OneDrive\\Рабочий стол\\";

    public String readFile(String fileName) {
        String data;
        inputFile = new File(BASE_PATH + fileName);
        if (inputFile.exists() && isValidExtension(fileName)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
                while ((data = bufferedReader.readLine()) != null) {
                    inputData = inputData + "\n" + data;
                }
            } catch (FileNotFoundException e) {
                System.out.println("Can not read this file.");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return inputData;
        }
        return "File with this name is not exist or !";
    }

    public void writeFile(String fileName, String data) {
        outputFile = new File(BASE_PATH + fileName + ".txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile));) {
            bufferedWriter.write(data);
            System.out.println("Successful!");
        } catch (IOException e) {
            System.out.println("Can not find file with " + fileName + " name");
        }
    }

    public String processData(String data) {
        String modifiedData = data.toUpperCase();
        return modifiedData;
    }

    private boolean isValidExtension(String fileName) {
        String[] split = fileName.split("\\.");
        boolean isValid = false;
        switch (split[1]) {
            case "txt":
            case "json":
            case "cvs":
                isValid = true;
                break;
        }
        return isValid;
    }
}
