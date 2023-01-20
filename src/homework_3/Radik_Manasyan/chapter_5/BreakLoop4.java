package homework_3.Radik_Manasyan.chapter_5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Пpoxoд" + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outer;
                {
                    System.out.print(j + " ");
                }
            }
            System.out.println("Эта не строка будет выводиться");
        }
        System.out.println("Циклы завершены.");
    }
}
