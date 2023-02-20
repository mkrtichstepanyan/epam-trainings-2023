package homework_4.Ani_Kovalenko.Chapter_7;

public class OverloadDemo {
    void test(){
        System.out.println("No Parameters");
    }
    void test (int a){
        System.out.println("a: " + a);
    }
    void test (int a, int b){
        System.out.println("a and b: " + a + " " +b);
    }
    double test(double a){
        System.out.println("double a: " + a);
        return a*a;
    }
    void test2(double a){
        System.out.println("Inside test double a: " + a);
    }
}
