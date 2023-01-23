package homework_3.Varsik_Pijoyan.chapter_5;

public class BreakLoop3 {
    public static void main(String[] args) {
        int j;
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass" + i + ":");
            for (j = 0; j < 100; j++) {
                if (j == 10) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete");
    }
}
