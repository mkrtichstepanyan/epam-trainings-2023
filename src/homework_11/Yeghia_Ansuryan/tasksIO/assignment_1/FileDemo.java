package homework_11.Yeghia_Ansuryan.tasksIO.assignment_1;

import java.util.Objects;

public class FileDemo {
    public static void main(String[] args) {
        String readFile = "src/homework_11/Yeghia_Ansuryan/tasksIO/assignment_1/text.txt";
        String writePath = "src/homework_11/Yeghia_Ansuryan/tasksIO/assignment_1/newText.txt";

        ReadAndWriteFile.readFile(readFile);
        ReadAndWriteFile.writeFile(writePath, ReadAndWriteFile.readFile(readFile));
        ReadAndWriteFile.processData(Objects.requireNonNull(ReadAndWriteFile.readFile(readFile)));
    }
}
