package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This class demonstrates
 * nested for loop
 */
public class Nested {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }
}
