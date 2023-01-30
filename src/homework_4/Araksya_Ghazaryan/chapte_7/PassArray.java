package homework_4.Araksya_Ghazaryan.chapte_7;

public class PassArray {
    static void vaTest(int[] v) {
        System.out.print(" Number of args: " + v.length + "Constant: ");
        for (int x : v) {
            System.out.print(x + " ");

        } System.out.println();
    }
    public static void main(String[] args) {
        int [] n1 = {10};
        int [] n2 = {1,2,3};
        int [] n3 = { };

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
