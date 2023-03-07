package homework_6.Eduard_Eghiazaryan.Chapter_6;

class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        super.show();
        System.out.println(msg + k);
    }
}