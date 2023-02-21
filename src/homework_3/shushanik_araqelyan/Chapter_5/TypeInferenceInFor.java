package homework_3.shushanik_araqelyan.Chapter_5;

public class TypeInferenceInFor {
    public static void main(String[] args) {
        //Use type inference with the loop control verible.
        System.out.println("Values of x : ");
        for (var x = 2.5; x < 100.0; x = x * 2)
            System.out.println(x + " ");
        System.out.println();
        //Use the inference with the iteration variable.
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("Values in nums array : ");
        for (var v : nums) {
            System.out.println(v + " ");
            System.out.println();
        }
    }
}