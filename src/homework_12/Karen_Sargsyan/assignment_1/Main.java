package homework_12.Karen_Sargsyan.assignment_1;

public class Main {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        String modifiedData = fileCreator.processData(fileCreator.readFile("test.txt"));
        fileCreator.writeFile(modifiedData, "test2.txt");
    }
    
}
