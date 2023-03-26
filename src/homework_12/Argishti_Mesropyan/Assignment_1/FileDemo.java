package homework_12.Argishti_Mesropyan.Assignment_1;

public class FileDemo {
    public static void main(String[] args) {
        String readFile = "src/homework_12/Argishti_Mesropyan/Assignment_1/nioText.txt";
        String writePath = "src/homework_12/Argishti_Mesropyan/Assignment_1/writtenText.txt";

        ReadAndWriteFile.readFile(readFile);
        ReadAndWriteFile.writeFile(writePath, ReadAndWriteFile.readFile(readFile));
        ReadAndWriteFile.processData(ReadAndWriteFile.readFile(readFile));

    }
}