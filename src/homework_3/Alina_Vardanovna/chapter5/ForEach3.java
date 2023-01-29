package homework_3.Alina_Vardanovna.chapter5;

public class ForEach3 {

    public static void main(String[] args) {

        int sum = 0;
        int[][] numbers = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                numbers[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] x : numbers) {
            for (int i : x) {
                System.out.println("Value is: " + i);
                sum = sum + i;
            }
        }
        System.out.println("Summation: " + sum);

    }

}


