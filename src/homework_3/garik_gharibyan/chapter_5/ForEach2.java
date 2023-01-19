package homework_3.garik_gharibyan.chapter_5;

public class ForEach2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : nums) {
            System.out.println("value is: " + i);
            sum += i;
            if (i == 5){
                break;
            }
        }
        System.out.println("summation of first 5 elements: " + sum);
    }
}
