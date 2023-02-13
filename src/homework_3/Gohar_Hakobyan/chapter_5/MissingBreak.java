package homework_3.Gohar_Hakobyan.chapter_5;

public class MissingBreak {
    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 0, 1, 2, 3, 4 -> System.out.println("i < 5");
                case 5, 6, 7, 8, 9 -> System.out.println("i < 10");
                default -> System.out.println("i >= 10");
            }
        }
    }
}
