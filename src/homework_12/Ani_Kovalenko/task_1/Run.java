package homework_12.Ani_Kovalenko.task_1;

class Run {
    public static void main(String[] args) {

        FileCreator fileCreator = new FileCreator();

        String modifiedData = fileCreator.processData(fileCreator.readFile("test.txt"));

        fileCreator.writeFile(modifiedData, "test2.txt");
    }
}
