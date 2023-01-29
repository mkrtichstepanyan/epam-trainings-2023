package homework_3.Alina_Vardanovna.chapter5;

public class NoChange {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int x : numbers) {
            System.out.println(x + " ");
            x *= 10;
        }
        System.out.println();
        for (int x : numbers) {
            System.out.println(x + " ");
        }

        System.out.println();

    }

}
