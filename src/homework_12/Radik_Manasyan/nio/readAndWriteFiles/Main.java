package homework_12.Radik_Manasyan.nio.readAndWriteFiles;


public class Main {
    public static void main(String[] args) {
        String filePath = "src/homework_12/Radik_Manasyan/nio";
        String fileName = "test.txt";
        String outPath = "src/homework_12/Radik_Manasyan/nio/readAndWriteFiles/copy.txt";

        String readFile = NIO.readFile(filePath, fileName);
        System.out.println(readFile);

        String strToUpperCase = NIO.processData(readFile);
        System.out.println(strToUpperCase);

        NIO.writeFile(outPath, filePath+"/"+fileName);

    }
}
