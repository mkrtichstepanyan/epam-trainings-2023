package homework_4.gohar_hakobyan.chapter_7;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.print("Count of args: " + v.length + " Contents: ");

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
