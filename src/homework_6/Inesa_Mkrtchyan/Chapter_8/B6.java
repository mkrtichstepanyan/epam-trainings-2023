package homework_6.Inesa_Mkrtchyan.Chapter_8;

class B6 extends A6{
    int k;
    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(String msg) {
        System.out.println(msg + k);
    }
}
