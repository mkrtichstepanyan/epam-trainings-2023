package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This program uses break
 * to exit a while-loop
 */
public class BreakLoop2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if(i == 10){
                break;
            }
            System.out.println("i: " + i);
            i++;
        }
        System.out.println("Loop complete. ");
    }
}
