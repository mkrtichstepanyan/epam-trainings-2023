package homework_6.Vazgen_Harutyunyan.chapter_8.overridingMethod;

public class B extends A{
    int k;

    B(int a,int b,int c){
        super(a,b);
        k = c;
    }
    void show(){
        System.out.println("k:" + k);
    }
}
