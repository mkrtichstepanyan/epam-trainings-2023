package homework_11.Karen_Sargsyan.assignment_1;

public class Main {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        fileCreator.createFile("text.txt", "test2.txt");
        String modifiedData = fileCreator.processData(fileCreator.readFile());
        fileCreator.writeFile(modifiedData);
    }

}
