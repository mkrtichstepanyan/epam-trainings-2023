package homework_4.Roza_Petrosyan.chapter_7;

//Demonstrate method overloading.
public class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    // Overload test for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Overload test for two integer parameters
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    //Overload test for a double parameter
    double test(double a) {
        System.out.println("Double a: " + a);
        return a * a;
    }

}
