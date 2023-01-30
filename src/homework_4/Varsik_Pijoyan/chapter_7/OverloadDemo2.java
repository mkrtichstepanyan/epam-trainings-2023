package homework_4.Varsik_Pijoyan.chapter_7;

public class OverloadDemo2 {
    void test(){
        System.out.println("No Parameters.");
    }

    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    void test(double a){
        System.out.println("Inside test (double) a: " + a);
    }
}
