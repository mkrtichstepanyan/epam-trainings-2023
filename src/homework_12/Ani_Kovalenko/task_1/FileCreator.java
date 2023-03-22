package homework_12.Ani_Kovalenko.task_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

class FileCreator {
    ByteBuffer readBuffer;

    String readFile(String fileNameToRead) {
        String inputString = " hello!\n hello!\n hello!\n hello!";
        ByteBuffer buffer = ByteBuffer.wrap(inputString.getBytes());
        if (isAllowedFileFormat(fileNameToRead)) {
            try (FileChannel channel = FileChannel.open(Paths.get(fileNameToRead),
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                channel.write(buffer);
                readBuffer = ByteBuffer.allocate(1024);
                return readFromTheCreatedFile(fileNameToRead, readBuffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            callingNonAcceptableFileFormatException();
        }
        return null;
    }

    private String readFromTheCreatedFile(String fileNameToRead, ByteBuffer readBuffer) {
        try (FileChannel channel2 = FileChannel.open(Paths.get(fileNameToRead), StandardOpenOption.READ)) {
            channel2.read(readBuffer);
            readBuffer.flip();
            this.readBuffer = readBuffer;
            String content = new String(readBuffer.array()).trim();
            return content;
        } catch (FileNotFoundException e) {
            System.err.println("File Not Found !");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Failed to create the file which is needed to read !");
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

    void writeFile(String modifiedData, String fileNameToWrite) {
        if (isAllowedFileFormat(fileNameToWrite)) {
            if (modifiedData != null) {
                ByteBuffer buffer = ByteBuffer.wrap(modifiedData.getBytes());
                try (FileChannel channel = FileChannel.open(Paths.get(fileNameToWrite),
                        StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
                    channel.write(buffer);
                } catch (IOException e) {
                    System.err.println("Failed to create the file in which is needed to write !");
                }
            }
        } else {
            callingNonAcceptableFileFormatException();
        }
    }

    private void callingNonAcceptableFileFormatException() {
        try {
            throw new NonAcceptableFileFormatException();
        } catch (NonAcceptableFileFormatException e) {
            System.err.println(e.getMessage());
            System.err.println("Unable to create the file");
            e.printStackTrace();
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
