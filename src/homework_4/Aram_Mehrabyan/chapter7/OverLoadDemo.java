package homework_4.Aram_Mehrabyan.chapter7;

public class OverLoadDemo {
    void test(){
        System.out.println("No parameters");
    }
    void test(int a){
        System.out.println("a: "+a);
    }
    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    double test(double a){
        return a*a;
    }
}
