package homework_4.Gevorg_Martirosian.chapter_7;

public class OverloadDemo2 {
    void test(){
        System.out.println("parameters doesn't exist");
    }

    //overload test() for two integer parameters
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }

    //overload test() for one double parameter
    void test(double a){
        System.out.println("inside test(double) a: " + a);
    }
}
