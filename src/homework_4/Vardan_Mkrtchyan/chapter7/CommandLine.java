package homework_4.Vardan_Mkrtchyan.chapter7;
public class CommandLine {
    public static void main(String[] args) {
         args = new String[]{"this", "is", "a", "test", "100", "-1"};
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]:" + " " + args[i]);
        }
    }
}
