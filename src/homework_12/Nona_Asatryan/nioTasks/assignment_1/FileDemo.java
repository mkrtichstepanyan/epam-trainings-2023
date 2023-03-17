package homework_12.Nona_Asatryan.nioTasks.assignment_1;

public class FileDemo {
    public static void main(String[] args) {
        String readFile = "/Users/nona.asatryan/epam-trainings-2023/src/homework_12/Nona_Asatryan/nioTasks/assignment_1/nioText.txt";
        String writePath = "/Users/nona.asatryan/epam-trainings-2023/src/homework_12/Nona_Asatryan/nioTasks/assignment_1/writtenNioText.txt";

        ReadAndWriteFile.readFile(readFile);
        ReadAndWriteFile.writeFile(writePath, ReadAndWriteFile.readFile(readFile));
        ReadAndWriteFile.processData(ReadAndWriteFile.readFile(readFile));
    }
}
