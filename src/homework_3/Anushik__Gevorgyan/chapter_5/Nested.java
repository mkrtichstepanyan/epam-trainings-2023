package homework_3.Anushik__Gevorgyan.chapter_5;

public class Nested {
    public static void main(String[] args) {
        int i, j;

        for (i = 0; i < 10; i++) {
            for (j = i; j < 10; j++)
                System.out.println(".");
            System.out.println();
        }
    }
}
