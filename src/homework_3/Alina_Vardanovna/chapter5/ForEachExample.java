package homework_3.Alina_Vardanovna.chapter5;

public class ForEachExample {

    public static void main(String[] args) {

        int[] numbers = {43, 55, 67, 88};
        char[] names = {'h', 'e', 'l', 'l', 'o'};

        for (int a : numbers) {
            System.out.print(a + " ");
        }

        System.out.println();

        for (char symbol : names) {
            System.out.print(symbol);
        }

    }

}
