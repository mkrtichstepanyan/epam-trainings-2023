package homework_6.Gevorg_Martirosian;

public class B5 extends A5{
    int k;

    public B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}
