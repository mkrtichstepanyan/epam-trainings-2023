package homework_4.garik_gharibyan.chapter_7;
class OverloadDemo2{
    void test(){
        System.out.println("No parameters");
    }
    void test(int a,int b){
        System.out.println("a and b: " + a +" " + b);
    }
    void test(double a){
        System.out.println("Inside test (double) a: " + a);
    }
}
public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 ov2 = new OverloadDemo2();
        int i = 88;

        ov2.test();
        ov2.test(10,20);
        ov2.test(i);
        ov2.test(123.25);

    }
}
