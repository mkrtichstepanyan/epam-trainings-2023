package homework_6.Levon_Harutyunyan.Chapter_8;

public class B4 extends A3 {
    int k;
    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show (String msg){
        System.out.println(msg + k);
    }
}
