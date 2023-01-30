package homework_4.Aram_Mehrabyan.chapter7;

public class OverLoadDemo1 {
    void test(){
        System.out.println("No parameters");
    }

    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    void test(double a){
        System.out.println("Inside the method double a: "+a);
    }
}
