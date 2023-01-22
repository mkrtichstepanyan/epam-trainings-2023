package homework_3.garik_gharibyan.chapter_5;

public class TypeInferenceInFor {
    public static void main(String[] args) {

        System.out.print("values of x: ");
        for (var x = 2.5; x < 100; x = x * 2) {
            System.out.print(x + " ");
        }

        System.out.println();


        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.print("values of nums ayyay: ");
        for (var v : nums) {
            System.out.print(v + " ");
        }

        System.out.println();
    }
}
