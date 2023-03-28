package homework_12.Nelli_Poghosyan.Assignment_1_NIO;

public class FileReaderWriterNIODemo {
    public static void main(String[] args) {
        String readFile = "epam-trainings-2023/src/homework_12/Nelli_Poghosyan/Assignment_1_NIO/ReadExample.txt";
        String writeFile = "epam-trainings-2023/src/homework_12/Nelli_Poghosyan/Assignment_1_NIO/WriteExample.txt";
        System.out.println(FileReaderWriter.readFile(readFile));
        FileReaderWriter.writeFile(writeFile, readFile);

    }
}
