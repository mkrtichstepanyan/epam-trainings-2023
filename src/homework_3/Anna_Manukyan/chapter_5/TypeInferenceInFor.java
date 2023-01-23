package homework_3.Anna_Manukyan.chapter_5;

//Use type inference in  for loop
public class TypeInferenceInFor {
    public static void main(String[] args) {
        System.out.println("Value of i is ");
        for (var i = 2.5; i < 100.0; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Value in nums array ");
        for (var x : nums) {
            System.out.print(x + " ");
        }

    }
}
