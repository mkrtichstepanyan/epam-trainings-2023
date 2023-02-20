package homework_6.Inesa_Mkrtchyan.Chapter_8;

class B5 extends A5{
    int k;
    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

