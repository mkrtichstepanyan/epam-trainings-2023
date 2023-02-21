package homework_3.Alina_Vardanovna.chapter5;

public class ForEach {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x : numbers) {
            System.out.println("Value is: " + x);
            sum += x;
        }

    }

}

//ForEach-ի կարճ գրելաձևն է iter: