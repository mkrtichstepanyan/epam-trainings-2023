package homework_11.Roza_Petrosyan.task.assignment_one;

import homework_11.Roza_Petrosyan.task.assignment_one.input_output.ReadAndWriteFile;

public class FileDemo {
    public static void main(String[] args) {
        String fileName = "src/homework_11/Roza_Petrosyan/task/assignment_one/file1.txt";

        String data = "There are many variations of passages of Lorem Ipsum available\n"
                + " but the majority have suffered alteration in some form\n"
                + " by injected humour, or randomised words which don't look even slightly believable.";

        ReadAndWriteFile file = new ReadAndWriteFile();
        file.writeFile(fileName, data);
        String modifiedData = file.processData(file.readFile(fileName));
        file.writeFile(fileName, modifiedData);
    }
}
