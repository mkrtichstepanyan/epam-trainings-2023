package homework_4.Diana_Melkonyan.chapter7;

public class PassArray {
    static void vaTest(int[] v) {
        System.out.print("Number of args: " + v.length + " Contents: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        //Notice how an array must be created to
        // hold the arguments.
        int[] n1 = { 10 };
        int[] n2 = {1,2,3};
        int[] n3 = { };

        vaTest(n1); // 1arg
        vaTest(n2); // 3 args
        vaTest(n3); // no args

    }
}
