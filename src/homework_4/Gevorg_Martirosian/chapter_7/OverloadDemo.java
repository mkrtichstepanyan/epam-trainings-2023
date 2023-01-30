package homework_4.Gevorg_Martirosian.chapter_7;

//demonstration of method overloading
public class OverloadDemo {
    void test() {
        System.out.println("parameters doesn't exist");
    }

    //overload test() for one integer parameter
    void test(int a) {
        System.out.println("a: " + a);
    }
    //overload test() for two integer parameters
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    //overload test() for one double parameter
    double test(double a){
        System.out.println("double a: " + a);
        return a * a;
    }
}
