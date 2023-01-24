package homework_5.chapter_7;

class PassArray {
    static void vaTest(int[] v) {
        System.out.println("Number od args: " + v.length + " Contents: ");

        for (int x : v)
            System.out.println(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};

        vaTest(n1);
        vaTest(n2);
        vaTest(n3);

    }
}
