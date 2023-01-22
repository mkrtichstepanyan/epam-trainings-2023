package Eduard_Eghiazaryan.chapter_5;

public class TypeInFerenceInFor {
    public static void main(String[] args) {
        System.out.print("Values x: ");

        for (var x = 2.5; x < 100.0; x = x * 2)
            System.out.print(x + " ");

        int[] nums = {1, 2, 3, 4, 5, 6,};
        System.out.print("Values in an array: ");
        for (var v : nums)
            System.out.print(v + " ");
        System.out.println();
    }
}
