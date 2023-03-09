package homework_11.Hovhannes_Gspeyan.assignment_1;

public class IOProcessor {

    public static void main(String[] args) {
        String readFile = "C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\Hovhannes_Gspeyan\\text.txt";
        String writePath = "C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\src\\homework_11\\Hovhannes_Gspeyan\\newText.txt";

        FileImplementor.readFile(readFile);
        FileImplementor.writeFile(writePath, FileImplementor.readFile(readFile));
        FileImplementor.processData(FileImplementor.readFile(readFile));
    }
}
