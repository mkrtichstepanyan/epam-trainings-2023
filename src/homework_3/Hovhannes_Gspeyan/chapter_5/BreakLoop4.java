package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This program uses break
 * to exit from nested loops
 */
public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if(j == 10){
                    break outer;
                }
                System.out.print(j + " ");
            }
            System.out.println("This won't print. ");
        }
        System.out.println("Loops complete. ");
    }
}
