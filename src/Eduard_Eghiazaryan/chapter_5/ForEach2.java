package Eduard_Eghiazaryan.chapter_5;

public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20};

        for (int x : nums) {
            System.out.println("Meaning: " + x);
            sum += x;
            if (x == 5) break;
        }
        System.out.println("The sum of the first five elemetns: " + sum);
    }
}
