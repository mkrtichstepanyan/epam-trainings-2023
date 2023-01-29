package homework_4.Vladimir_Vanyan.chapter_7;

class Outer2 {
    int outher_x = 100;

    void test() {
        Inner2 inner = new Inner2();
        inner.display();
    }

    // this is an inner class
    class Inner2 {
        int y = 10; // y is local to Inner

        void display() {
            System.out.println("display: outher_x = " + outher_x);
        }
    }

    void showy() {
        // System.out.println(y); // error, y not known here !
    }
}

class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
