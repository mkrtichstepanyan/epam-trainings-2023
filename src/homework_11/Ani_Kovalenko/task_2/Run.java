package homework_11.Ani_Kovalenko.task_2;

public class Run {
    public static void main(String[] args) {
        FileCreator fileCreator = new FileCreator();
        fileCreator.writeToFile(fileCreator.generatePhoneNumbers("033"), "PhoneNumber");
    }
}
