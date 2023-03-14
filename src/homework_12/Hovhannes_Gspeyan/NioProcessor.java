package homework_12.Hovhannes_Gspeyan;

public class NioProcessor {

    public static void main(String[] args) {
        String readFile = "C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\src\\homework_12\\Hovhannes_Gspeyan\\nioText.txt";
        String writePath = "C:\\Users\\ThinkPad\\Desktop\\RD\\epam-trainings-2023\\src\\homework_12\\Hovhannes_Gspeyan\\writtenNioText.txt";

        NioFileImplementor.readFile(readFile);
        NioFileImplementor.writeFile(writePath, NioFileImplementor.readFile(readFile));
        NioFileImplementor.processData(NioFileImplementor.readFile(readFile));
    }
}
