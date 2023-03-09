package homework_11.Qnarik_Khachatryan.Assignment_1;

import java.io.*;

public class Assignment_1 {

    public static void main(String[] args) {
        String data = readFile("src/homework_11/Qnarik_Khachatryan/" +
                "Assignment_1/fileToRead.txt");
        String modifiedData = processData(data);
        writeFile("src/homework_11/Qnarik_Khachatryan/" +
                "Assignment_1/fileToWrite.txt", modifiedData);
    }

    private static String readFile(String fileName) {
        if (isSupportedFormat(fileName)) {
            String result = "";
            try (FileInputStream f = new FileInputStream(fileName)) { //create an InputStream object)
                int size = f.available(); // all available bytes
                for (int i = 0; i < size; i++) {
                    result += (char) f.read();
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found" + e);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return result;
        }
        return null;
    }


    private static void writeFile(String fileName, String data) {
        if (isSupportedFormat(fileName)) {
            try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
                fileOutputStream.write(data.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String processData(String data) {
        if(data!=null) {
            return data.toUpperCase();
        }
        return "No data for modification";
    }

    private static boolean isSupportedFormat(String filename) {
        if (filename.endsWith(".txt") || filename.endsWith(".csv") || filename.endsWith(".json")) {
            return true;
        } else {
            System.out.println("Specified format does not supported by program");
            return false;
        }
    }
}
