package homework_4.Lilit_Adamyan.chapter_7;

public class OverloadDemo {
    void test(){
        System.out.println("No parameters");
    }
    void test(int a ){
        System.out.println("a : " + a);
    }
    void test(int a,int b){
        System.out.println("a and b : " + a + " " + b);
    }
    double test (double a){
        System.out.println("double a : " + a);
        return a * a;
    }
}