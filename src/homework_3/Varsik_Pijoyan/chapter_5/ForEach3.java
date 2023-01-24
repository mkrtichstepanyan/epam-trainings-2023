package homework_3.Varsik_Pijoyan.chapter_5;

public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];
        //giving nums some values
        int j;
        for (int i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
        //using for-each for to display and sum the values
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }
        System.out.println("Summation:" + sum);
    }
}
