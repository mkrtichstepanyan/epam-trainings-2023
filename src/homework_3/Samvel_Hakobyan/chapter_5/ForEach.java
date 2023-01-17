package homework_3.Samvel_Hakobyan.chapter_5;

public class ForEach {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int x:nums) {
            sum += x;
        }
        System.out.println("Summation " + sum);
    }
}
