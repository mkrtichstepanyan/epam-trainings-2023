package homework_12.Ani_Barseghyan.assignment_1;

public class Demo {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_12\\Ani_Barseghyan\\assignment_1\\readFile.txt";
        String outputFilePath = "C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_12\\Ani_Barseghyan\\assignment_1\\writeFile.txt";

        String readFile = FileReadWrite.readFile(inputFilePath);
        String modifiedData = FileReadWrite.processData(readFile);
        FileReadWrite.writeFile(outputFilePath, modifiedData);
    }
}
