package homework_4_1.Andranik_Sargsyan.chapter_7.varargs;

public class PassArray {
    static void vaTest(int[] v) {
        System.out.print("amount of arguments: " + v.length + " content: ");
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n1[] = {10};
        int n2[] = {1, 2, 3};
        int n3[] = {};
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
