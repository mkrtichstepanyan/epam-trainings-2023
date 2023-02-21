package homework_4.Varsik_Pijoyan.chapter_7;

public class OverloadDemo {
    void test() {   //Default constructor
        System.out.println("No Parameters.");
    }

    void test(int a) {   //Overloaded test constructor for one integer parameter
        System.out.println("a: " + a);
    }

    void test(int a, int b) {  //Overloading test constructor for two integer parameters
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a) { //Overloading test constructor for a double parameter
        System.out.println("double a: " + a);
        return a * a;
    }
}

