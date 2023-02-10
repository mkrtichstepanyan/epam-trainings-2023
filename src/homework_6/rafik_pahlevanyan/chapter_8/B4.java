package homework_6.rafik_pahlevanyan.chapter_8;

//Create a subclass
class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    //display k- this overrides show() in A4
    void show() {
        super.show();//this calls A4`s show()
        System.out.println("k: " + k);
    }
}