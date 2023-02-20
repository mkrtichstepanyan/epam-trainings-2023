package homework_3.Hayk_Davtyan.chapter_5;

public class BreakLoop2 {
    public static void main(String [] args) {
        int i = 0;
        while (i < 10) {
            if (i == 10) break;
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete.");
    }
}
