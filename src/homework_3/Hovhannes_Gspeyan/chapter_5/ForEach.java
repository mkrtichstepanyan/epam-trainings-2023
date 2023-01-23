package homework_3.Hovhannes_Gspeyan.chapter_5;

/**
 * This class demonstrates the
 * for - each style for loop
 */
public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums) {
            System.out.println("value is " + x);
            sum += x;
        }
        System.out.println("Summation " + sum);
    }
}
