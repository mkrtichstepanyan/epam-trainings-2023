package homework_12.Yeghia_Ansuryan.tasksNIO.assignment_1;

import homework_11.Nona_Asatryan.ioTasks.assignment_1.ReadAndWriteFile;

public class FileDemo {
    public static void main(String[] args) {
        String readFile = "Users/yeghia.ansuryan/epam-training-2023/src/homework_12/Yeghia_Ansuryan/" + "tasksNIO/assignment_1/nioText.txt";
        String writePath = "Users/yeghia.ansuryan/epam-training-2023/src/homework_12/Yeghia_Ansuryan/" + "tasksNIO/assignment_1/writtenNioText.txt";

        ReadAndWriteFile.readFile(readFile);
        ReadAndWriteFile.writeFile(writePath, ReadAndWriteFile.readFile(readFile));
        ReadAndWriteFile.processData(ReadAndWriteFile.readFile(readFile));
    }
}
