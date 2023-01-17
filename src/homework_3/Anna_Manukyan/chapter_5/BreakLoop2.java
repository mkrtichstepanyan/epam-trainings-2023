package homework_3.Anna_Manukyan.chapter_5;

//Using break to exit a while loop

public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 10) {
                break;
            }
            System.out.println("i is " + i);
            i++;
        }
        System.out.println("Loop complete");
    }
}
