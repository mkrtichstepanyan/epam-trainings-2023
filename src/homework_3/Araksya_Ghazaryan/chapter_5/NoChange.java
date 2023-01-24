package homework_3.Araksya_Ghazaryan.chapter_5;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int x : nums) {
            System.out.println( x + " ");
            x = x * 10;
        }
        System.out.println();
        for (int x : nums)
            System.out.println(x + " ");

        System.out.println();
    }
}