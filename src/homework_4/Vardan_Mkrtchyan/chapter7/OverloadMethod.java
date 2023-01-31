package homework_4.Vardan_Mkrtchyan.chapter7;

public class OverloadMethod {
    void test (){
        System.out.println("No parameters");
    }
    void test (int a){
        System.out.println("a: " + a);
    }
    void test (int a, int b){
        System.out.println("a: " + a + ", b: " + b);
    }
    double test(double a){
        return a * a;
    }
}
class Overload {
    public static void main(String[] args) {
        OverloadMethod ob = new OverloadMethod();
        ob.test();
        ob.test(1);
        ob.test(1,2);
        System.out.println(ob.test(5.5));
    }
}

