package homework_11.Anush_Ananyan.Assignment_1;

public class Main {
    public static void main(String[] args) {

        String readfile = "src/homework_11/Anush_Ananyan/Assignment_1/file1.txt";
        String writefile = "src/homework_11/Anush_Ananyan/Assignment_1/file2.txt";


        ReadAndWriteFile file = new ReadAndWriteFile();

        String data = file.readFile(readfile);

        file.writeFile(writefile, file.processData(data));


    }
}
