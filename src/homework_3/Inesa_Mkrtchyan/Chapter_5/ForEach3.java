package homework_3.Inesa_Mkrtchyan.Chapter_5;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation " + sum);
    }
}
