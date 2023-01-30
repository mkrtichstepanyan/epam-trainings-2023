package homework_4.Galust_Arzumanyan.homework_4_1.chapter_7;


// This method is used to demonstrate automatic type conversions to overloading
class OverloadDemo1 {
    void test() {
        System.out.println(" No parameters ");
    }

    void test(int a, int b) {
        System.out.println(" a and b: " + a + " " + b);
    }

    void test(double a) {
        System.out.println(" Inside test(double) a: " + a);
    }
}

class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        int i = 88;

        ob.test();
        ob.test(10, 20);
        ob.test(i);
        ob.test(123.2);

    }
}
