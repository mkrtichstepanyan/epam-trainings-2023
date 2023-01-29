package homework_4.Vladimir_Vanyan.chapter_7;

class VarArgs4 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ...)" + "Number of args: " + v.length + " Contents: ");

        for (int x : v)
            System.out.print(x + " ");

        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest (boolean ...) " + "Number of args: " + v.length + " Contents:");

        for (boolean x : v)
            System.out.println(x + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3); //OK
        vaTest(true, false, false); //OK
        // vaTest(); // Error: Ambiguous!
    }
}
