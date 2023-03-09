package homework_11.anna_manukyan.assignment_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, FileFormatException {
        String filename="anna.txt";
        DataProcess dataProcess = new DataProcess();
        String s = dataProcess.readFile(filename);
        System.out.println(s);
        printLine();
        String data = randomText();
        dataProcess.writeFile("newFile",data);
        printLine();
        String modifiedData = dataProcess.processData(data);
        System.out.println(modifiedData);
    }

    private  static void printLine(){
        System.out.println("*******************");
    }

    private static String randomText(){
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n" +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when\n" +
                "an unknown printer took a galley of type and scrambled it to make a type specimen book.\n" +
                "It has survived not only five centuries, but also the leap into electronic typesetting,\n" +
                "remaining essentially unchanged.";
        return text;
    }
}
