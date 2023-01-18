package Gevorg_Martirosian.chapter_5;

//demonstration of for-each loop
public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        //using the for loop int for-each style
        //for presentation and calculating the sum of values
        for (int x : nums) {
            System.out.println("value: " + x);
            sum += x;
        }

        System.out.println("summary: " + sum);
    }
}
