package homework_12.TatevKocharyan.nioHomework.assignment1;

public class ReadAndWriteDemo {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\text.txt";
        ReadAndWrite.readFile(fileName);
        ReadAndWrite.writeFile(fileName, "How are you");
        ReadAndWrite.processData("hello");
    }
}
