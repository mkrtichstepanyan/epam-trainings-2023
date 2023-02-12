package homework_6.Ani_Barseghyan.chapter_8.Simple_Inheritance;

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Contents of superOb: ");
        superOb.show_IJ();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Contents of subOb: ");
        subOb.show_IJ();
        subOb.show_K();
        System.out.println();

        System.out.println("Sum of i, j and k in subOb: ");
        subOb.sum();

    }
}
