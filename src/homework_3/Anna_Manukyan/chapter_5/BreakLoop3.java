package homework_3.Anna_Manukyan.chapter_5;

//Using break with nested loops
public class BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                }
                System.out.print("j is " + j);
            }
            System.out.println();
        }
        System.out.println("Loop complete");
    }
}
