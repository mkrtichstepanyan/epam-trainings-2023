package homework_11.Radik_Manasyan.readAndWriteFiles;

import java.io.*;

public class IO {
    public static String readFile(String fileName) {
        int i;
        String text = "";
        if (checkCorrectFileType(fileName)) {
            try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileName))) {
                do {
                    i = bufferedInputStream.read();
                    if (i != -1) {
                        text += (char) i;
                    }
                } while (i != -1);
            } catch (IOException e) {
                System.out.println("Файл не найден.");
            }
            return text;
        }
        return "please input correct file type(.txt,.cvs.json)";
    }

    private static boolean checkCorrectFileType(String fileType) {
        return fileType.endsWith(".txt") || fileType.endsWith(".cvs") || fileType.endsWith(".json");
    }

    public static String processData(String data) {
        return data.toUpperCase();
    }

    public static void writeFile(String fileName, String data) {
        int i;

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(data));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileName))) {
            do {
                i = bufferedInputStream.read();
                if (i != -1) {
                    bufferedOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("File not found. try again");
        }
    }
}

