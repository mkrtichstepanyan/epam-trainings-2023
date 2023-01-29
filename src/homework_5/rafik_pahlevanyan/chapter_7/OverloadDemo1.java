package homework_5.rafik_pahlevanyan.chapter_7;

//Automatic type conversions apply to overloading
public class OverloadDemo1 {

    void test() {
        System.out.println("No parameters");
    }

    //Overload test for two integer parameters
    void test(int a, int b) {
        System.out.println("a & b: " + a + " " + b);

    }

    //Overload test for a double parameter
    double test(double a) {
        System.out.println("Inside " +
                "test(double) а " + a);
        return a * a;

    }

}

