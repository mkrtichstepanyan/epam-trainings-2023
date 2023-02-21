package homework_4.Anna_Manukyan.chapter_7;

//Display all command line arguments
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("str[" + i + "]: " + args[i]);
        }
    }
}
