package homework_9.assignment.Zara_Avetyan.Homework;

public class Errors {
    private static int index = 0;
    private static String[] errors = new String[10];

    public static void Error(String name) {
        errors[index] = name;
        index++;
    }

    public static void print() {
        for (int i = 0; i < index; i++) {
            System.out.println(errors[i] + " is unavailable");
        }
    }

}
