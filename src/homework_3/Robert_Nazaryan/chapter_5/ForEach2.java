package homework_3.Robert_Nazaryan.chapter_5;

//Use break with a for-each style for
public class ForEach2 {

    public static void main(String[] args) {

        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //use for to display and sum the values
        for (int x : nums) {
            System.out.println("Value is : " + x);
            sum += x;
            if (x == 5) {
                break; // stop the loop when 5 is obtained
            }
        }
        System.out.println("Sum of first 5 elements: " + sum);
    }
}
