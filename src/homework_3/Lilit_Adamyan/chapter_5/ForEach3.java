package homework_3.Lilit_Adamyan.chapter_5;

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
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summatiom: " + sum);
    }
}
