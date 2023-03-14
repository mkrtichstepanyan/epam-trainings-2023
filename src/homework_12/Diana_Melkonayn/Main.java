package homework_12.Diana_Melkonayn;

public class Main {

    public static void main(String[] args) {
        String readFile = "src\\homework_12\\Diana_Melkonayn\\nio.txt";

        String data = NIO.readFile(readFile);
        System.out.println(data);

        String processData = NIO.processData(data);
        System.out.println(processData);

        NIO.writeFile(data,processData);

    }
}
