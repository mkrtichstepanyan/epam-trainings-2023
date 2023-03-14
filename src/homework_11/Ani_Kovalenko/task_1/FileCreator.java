package homework_11.Ani_Kovalenko.task_1;

import java.io.*;

class FileCreator {
    String fileToReadPath = "src/homework_11/Ani_Kovalenko/task_1/files/";
    String fileToWritePath = "src/homework_11/Ani_Kovalenko/task_1/files/";
    BufferedReader read;
    BufferedWriter write;
    File fileToRead;
    File fileToWrite;
    String fileNameToRead;
    String fileNameToWrite;
    StringBuilder stringBuilder;

    void createFile(String fileNameToRead, String fileNameToWrite) {
        if (isAllowedFileFormat(fileNameToRead)) {
            this.fileNameToRead = fileNameToRead;
            fileToRead = new File(fileToReadPath.concat(fileNameToRead));
            String inputString = " hello!\n hello!\n hello!\n hello!";
            try (FileWriter inputTextInTheReadFile = new FileWriter(fileToRead)) {
                fileToRead.createNewFile();
                inputTextInTheReadFile.write(inputString);
            } catch (IOException e) {
                System.err.println("Failed to create the file which is needed to read !");
            }
        } else {
            try {
                throw new NonAcceptableFileFormatException();
            } catch (NonAcceptableFileFormatException e) {
                System.err.println(e.getMessage());
                System.err.println("Unable to create the file for reading");
                e.printStackTrace();
            }
        }
        if (isAllowedFileFormat(fileNameToWrite)) {
            this.fileNameToWrite = fileNameToWrite;
            try {
                fileToWrite = new File(fileToWritePath.concat(fileNameToWrite));
                fileToWrite.createNewFile();
            } catch (IOException e) {
                System.err.println("Failed to create the file in which is needed to write !");
            }
        } else {
            try {
                throw new NonAcceptableFileFormatException();
            } catch (NonAcceptableFileFormatException e) {
                System.err.println(e.getMessage());
                System.err.println("Unable to create the file for writing");
                e.printStackTrace();
            }
        }
    }

    String readFile() {
        if (fileToRead != null) {
            try {
                read = new BufferedReader(new FileReader(fileToRead));
                String line;
                stringBuilder = new StringBuilder();
                while ((line = read.readLine()) != null) {
                    stringBuilder.append(line).append("\n");
                }
                return stringBuilder.toString();
            } catch (FileNotFoundException e) {
                System.err.println("File Not Found !");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (read != null) {
                        read.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
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

    void writeFile(String modifiedData) {
        if (fileToWrite != null) {
            try {
                write = new BufferedWriter(new FileWriter(fileToWrite));
                if (modifiedData != null) {
                    write.write(modifiedData);
                }
            } catch (FileNotFoundException e) {
                System.err.println("File Not Found !");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (write != null) {
                        write.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    boolean isAllowedFileFormat(String fileName) {
        if (fileName != null) {
            for (int i = 0; i < AcceptableFileFormats.values().length; i++) {
                if (fileName.endsWith(AcceptableFileFormats.values()[i].getFileFormat())) {
                    return true;
                }
            }
        }
        return false;
    }
}
