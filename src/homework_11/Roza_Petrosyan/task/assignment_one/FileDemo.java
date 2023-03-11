package homework_11.Roza_Petrosyan.task.assignment_one;

import homework_11.Roza_Petrosyan.task.assignment_one.input_output.ReadAndWriteFile;
import homework_11.Roza_Petrosyan.task.assignment_one.input_output.ReadAndWriteFileWithNIO;

public class FileDemo {
    public static void main(String[] args) {
        String fileName = "src/homework_11/Roza_Petrosyan/task/assignment_one/file1.txt";

        String data = "There are many variations of passages of Lorem Ipsum available\n"
                + " but the majority have suffered alteration in some form\n"
                + " by injected humour, or randomised words which don't look even slightly believable.";

//        ReadAndWriteFile file = new ReadAndWriteFile();
//        file.writeFile(fileName, data);
//        String modifiedData = file.processData(file.readFile(fileName));
//        file.writeFile(fileName, modifiedData);

        ReadAndWriteFileWithNIO file2 = new ReadAndWriteFileWithNIO();
        file2.writeFile(fileName, data);
        String modifiedData2 = file2.processData(file2.readFile(fileName));
        file2.writeFile(fileName, modifiedData2);
    }
}
