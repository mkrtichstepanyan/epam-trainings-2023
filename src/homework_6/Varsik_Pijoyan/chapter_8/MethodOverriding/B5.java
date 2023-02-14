package homework_6.Varsik_Pijoyan.chapter_8.MethodOverriding;

public class B5 extends A5{
    int k;

    B5(int a, int b, int c){
        super(a, b);
        k = c;
    }
    void show(String msg){
        System.out.println(msg + k);
    }
}
