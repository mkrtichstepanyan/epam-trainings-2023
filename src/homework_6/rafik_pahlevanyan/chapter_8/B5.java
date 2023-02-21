package homework_6.rafik_pahlevanyan.chapter_8;

//Create a subclass by extending class A5
class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //overload show
    void show(String msg) {
        super.show();
        System.out.println(msg + k);
    }
}