package homework_3.Vahe_Vardanyan.chapter_5;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
            if (i % 2 == 0) continue;
            System.out.println("");
        }
    }
}
