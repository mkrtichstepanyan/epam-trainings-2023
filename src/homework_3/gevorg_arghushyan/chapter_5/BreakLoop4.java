package homework_3.gevorg_arghushyan.chapter_5;

public class BreakLoop4 {
    public static void main(String[] args) {
        other:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break other;
                System.out.print(j + " ");
            }
            System.out.println("This will not be output.");
        }
        System.out.println("Loop is completed.");
    }
}
