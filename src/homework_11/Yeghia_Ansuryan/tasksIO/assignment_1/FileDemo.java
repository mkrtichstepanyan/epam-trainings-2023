package homework_11.Yeghia_Ansuryan.tasksIO.assignment_1;

import java.util.Objects;

public class FileDemo {
    public static void main(String[] args) {
        String readFile = "Users/yeghia.ansuryan/epam-training-2023/src/homework_11/Yeghia_Ansuryan/tasksIO/assignment_1/text.txt";
        String writePath = "Users/yeghia.ansuryan/epam-training-2023/src/homework_11/Yeghia_Ansuryan/tasksIO/assignment_1/newText.txt";

        ReadAndWriteFile.readFile(readFile);
        ReadAndWriteFile.writeFile(writePath, ReadAndWriteFile.readFile(readFile));
        ReadAndWriteFile.processData(Objects.requireNonNull(ReadAndWriteFile.readFile(readFile)));
    }
}
