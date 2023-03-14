package homework_11.Ani_Kovalenko.task_1;

class Run {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        fileCreator.createFile("test.txt", "test2.txt");
        String modifiedData = fileCreator.processData(fileCreator.readFile());
        fileCreator.writeFile(modifiedData);
    }
}
