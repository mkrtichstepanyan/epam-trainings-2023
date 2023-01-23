package homework_3.Roza_Petrosyan.chapter_5;

// Using continue with a label
public class ContinueLabel {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (j > i) {
                        System.out.println();
                        continue outer;
                    }
                    System.out.print(" " + (i * j));
                }
                System.out.println();
            }
    }
}