package homework_3.Gevorg_Martirosian.chapter_5;

//using break in for-each loop
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //using the for loop int for-each style
        //for presentation and calculating the sum of values
        for (int x : nums) {
            System.out.println("value: " + x);
            sum += x;
            //when the value equals 5 we stop the loop
            if (x == 5) {
                break;
            }
        }
        System.out.println("sum of first five elements: " + sum);
    }
}
