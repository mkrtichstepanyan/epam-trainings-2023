package homework_3.Alina_Mkhoyan.chapter_5;

public class ContinueLabel {
    public static void main(String[] args) {
        outher:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outher;
                }
                System.out.print(" " + (i * j));
            }
        }
        System.out.println();
    }
}
