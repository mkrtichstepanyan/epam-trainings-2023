package homework_4.Liana_gevorgyan.Chapter_7;
//Demonstrate method overloading
class OverloadDemo {
    void test() {
        System.out.println("Without parameters ");
    }

    //Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a " + a);
    }
    //Overload test for two parameters
    void test(int a, int b) {
        System.out.println("a and b " + a + " " + b);
    }
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}
class Overload {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        //call all versions of test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("Result of ob.test(123.25 ): " + result);
    }
}


