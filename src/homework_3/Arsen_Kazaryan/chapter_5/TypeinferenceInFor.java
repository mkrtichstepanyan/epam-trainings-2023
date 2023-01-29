package homework_3.Arsen_Kazaryan.chapter_5;

public class TypeinferenceInFor {
    public static void main(String[] args) {
        System.out.print("Values of x: ");
        for (var x = 2.5; x < 100.0; x = x * 2) {
            System.out.print(x + " ");
        }
        System.out.println();
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.print("Values in num array: ");
        for (var v : num) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
