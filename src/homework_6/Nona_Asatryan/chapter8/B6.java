package homework_6.Nona_Asatryan.chapter8;

public class B6 extends A5{
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show (String msg) {
        System.out.println(msg + k);
    }
}
