package homework_3.garik_gharibyan.chapter_5;

public class NoChange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : nums) {
            System.out.print(i + " ");
            i = i * 10;
        }

        System.out.println();

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
