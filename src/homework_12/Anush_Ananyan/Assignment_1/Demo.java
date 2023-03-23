package homework_12.Anush_Ananyan.Assignment_1;

public class Demo {
    public static void main(String[] args) {
        String readFile = "src/homework_12/Anush_Ananyan/Assignment_1/file1.txt";
        String writeFile = "src/homework_12/Anush_Ananyan/Assignment_1/file2.txt";

        ReadAndWriteWith_NIO file= new ReadAndWriteWith_NIO();
        String data = file.readFile(readFile);
        file.writeFile(writeFile, file.processData(data));

    }
}
