package homework_3.Arsen_Kazaryan.chapter_5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outher:
        for (int i = 0; i < 3; i++) {
            System.out.println("Проход" + i + ":");
            for (int j = 0; j < 100; j++) {
                if (j == 10) break outher;
                System.out.println(j + "");
            }
            System.out.println("Это выводиться не будет.");
        }
        System.out.println("Циклы завершены.");
    }
}
