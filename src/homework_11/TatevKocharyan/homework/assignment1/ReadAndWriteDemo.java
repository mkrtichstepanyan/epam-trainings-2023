package homework_11.TatevKocharyan.homework.assignment1;

public class ReadAndWriteDemo {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Lenovo\\Desktop\\Java Essential Library\\text.txt";
        ReadAndWrite.readFile(fileName);
        ReadAndWrite.writeFile(fileName, "How are you");
        ReadAndWrite.processData("hello");
    }
}
