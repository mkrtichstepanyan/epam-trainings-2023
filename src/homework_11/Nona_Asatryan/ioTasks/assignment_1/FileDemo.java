package homework_11.Nona_Asatryan.ioTasks.assignment_1;

public class FileDemo {
    public static void main(String[] args) {
        String readFile = "/Users/nona.asatryan/epam-trainings-2023/src/homework_11/Nona_Asatryan/ioTasks/assignment_1/text.txt";
        String writePath = "/Users/nona.asatryan/epam-trainings-2023/src/homework_11/Nona_Asatryan/ioTasks/assignment_1/newText.txt";

        ReadAndWriteFile.readFile(readFile);
        ReadAndWriteFile.writeFile(writePath, ReadAndWriteFile.readFile(readFile));
        ReadAndWriteFile.processData(ReadAndWriteFile.readFile(readFile));
    }
}
