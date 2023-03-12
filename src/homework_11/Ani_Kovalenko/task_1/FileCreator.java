package homework_11.Ani_Kovalenko.task_1;

import java.io.*;

class FileCreator {
    String fileToReadPath = "C:\\Users\\HP\\Desktop\\";
    String fileToWritePath = "C:\\Users\\HP\\Desktop\\";
    BufferedReader read;
    BufferedWriter write;
    File fileToRead;
    File fileToWrite;
    StringBuilder stringBuilder;

    void createFile(String fileNameToRead, String fileNameToWrite) {
        fileToRead = new File(fileToReadPath.concat(fileNameToRead));
        fileToWrite = new File(fileToWritePath.concat(fileNameToWrite));
        String inputString = " hello!\n hello!\n hello!\n hello!";
        try (FileWriter inputTextInTheReadFile = new FileWriter(fileToRead)) {
            fileToRead.createNewFile();
            inputTextInTheReadFile.write(inputString);
        } catch (IOException e) {
            System.err.println("Failed to create the file which is needed to read !");
        }
        try {
            fileToWrite.createNewFile();
        } catch (IOException e) {
            System.out.println("Failed to create the file in which is needed to write !");
        }
    }

    String readFile(String fileNameToRead) {
        try {
            read = new BufferedReader(new FileReader(fileToRead));
            String line;
            stringBuilder = new StringBuilder();
            while ((line = read.readLine()) != null) {

                stringBuilder.append(line).append("\n");
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    String processData(String data) {
        if (data != null) {
            String generatedText = null;
            String finalText = "";
            int lineNumber = 1;
            String addedInfo = " this is the modified data \n";
            for (int i = 0; i <= data.lines().count(); i++) {
                generatedText = lineNumber + data.lines().toList().get(i).concat(addedInfo).toUpperCase();
                lineNumber++;
                finalText += generatedText;
                if (lineNumber - 1 == data.lines().count()) {
                    return finalText;
                }
            }
        }
        return null;
    }

    void writeFile(String fileNameToWrite, String modifiedData) {
        try {
            write = new BufferedWriter(new FileWriter(fileToWrite));
            if (modifiedData != null) {
                write.write(modifiedData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                write.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
