package homework_6.Gevorg_Martirosian;

public class B4 extends A4{
    int k;

    public B4(int a, int b, int c){
        super(a,b);
        k = c;
    }

    void show(){
        System.out.println("k: " + k);
    }
}
