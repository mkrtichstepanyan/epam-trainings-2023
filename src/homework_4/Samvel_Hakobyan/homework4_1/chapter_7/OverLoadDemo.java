package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class OverLoadDemo {

    void test(){
        System.out.println("NO parametrs ");
    }

    void test (int a){
        System.out.println("a: " + a);
    }
    void test(int a,int b){
        System.out.println("a and b: " + a + " " + b);
    }

    double test (double a ){
        System.out.println("double a: " + a);
        return a*a;
    }
}

