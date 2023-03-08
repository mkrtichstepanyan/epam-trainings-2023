package homework_11.Ani_Barseghyan.assignment_1;


public class Demo {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_11\\Ani_Barseghyan\\readFile.txt";
        String outputFilePath = "C:\\Users\\ABarseghyan\\IdeaProjects\\epam-trainings-2023\\src\\homework_11\\Ani_Barseghyan\\writeFile.txt";

        String readFile = FileReadWrite.readFile(inputFilePath);
        FileReadWrite.writeFile(outputFilePath, readFile);
    }
}
