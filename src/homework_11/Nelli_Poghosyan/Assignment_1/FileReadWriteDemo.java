package homework_11.Nelli_Poghosyan.Assignment_1;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        FileReaderWriter reader = new FileReaderWriter();
        String filePath = "epam-trainings-2023/src/homework_11/Nelli_Poghosyan/Assignment_1/fileRead.txt";
        String filePath1 = "epam-trainings-2023/src/homework_11/Nelli_Poghosyan/Assignment_1/fileWrite.txt";
        System.out.println(reader.ReadFile(filePath));
        reader.writeFile(filePath1, filePath);
    }
}
