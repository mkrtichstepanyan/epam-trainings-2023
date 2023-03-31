package homework_12.Davit_Poghosyan.Assignment_1;

public class Main {
        public static void main(String[] args) {
            String readFile = "src/homework_12/Davit_Poghosyan/Assignment_1/Readfile.txt";
            String writeFile = "src/homework_12/Davit_Poghosyan/Assignment_1/Writefile.txt";
            System.out.println(FileReadWrite.readFile(readFile));
            FileReadWrite.writeFile(writeFile, readFile);
        }
    }

