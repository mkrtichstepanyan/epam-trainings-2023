package homework_3.Gevorg_Martirosian.chapter_5;

//using for-each loop for multiply array
public class ForEach3 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] nums = new int[3][5];

        //putting values in nums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }

        //using the for loop int for-each style
        //for presentation and calculating the sum of values
        for (int[] x : nums) {
            for (int y : x) {
                System.out.println("value of y: " + y);
                sum += y;
            }
        }

        System.out.println("summary: " + sum);
    }
}
