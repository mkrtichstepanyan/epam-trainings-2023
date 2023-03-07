package homework_11.anna_manukyan.assignment_1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename="anna.txt";
        DataProcess dataProcess = new DataProcess();
        String s = dataProcess.readFile(filename);
        System.out.println(s);
        printLine();
        String data = "Barev dzez";
        dataProcess.writeFile("newFile",data);
        printLine();
        String modifiedData = dataProcess.processData(data);
        System.out.println(modifiedData);
    }

    private  static void printLine(){
        System.out.println("*******************");
    }
}
