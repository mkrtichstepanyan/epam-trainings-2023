package homework_11.Zara_Avetyan.assignment_1;

public class FileDemo {
    public static void main(String[] args) {
        String fileName = "C:/Users/Admin/Desktop/RD/epam-trainings-2023/src/homework_11/Zara_Avetyan/assignment_1/text.txt";
        String newFile = "C:/Users/Admin/Desktop/RD/epam-trainings-2023/src/homework_11/Zara_Avetyan/assignment_1/newText.txt";
        new ReadAndWriteFile().writeFile(newFile, new ReadAndWriteFile().processData(new ReadAndWriteFile().readFile(fileName)));
    }
}
