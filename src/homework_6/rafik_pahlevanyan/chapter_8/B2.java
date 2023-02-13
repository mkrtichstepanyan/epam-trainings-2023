package homework_6.rafik_pahlevanyan.chapter_8;

//Create a subclass by extending class A2
class B2 extends A2 {
    int i;  //this i hides the i in A2

    B2(int a, int b) {
        super.i = a;    //i in A2
        i = b;  //i in B2
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}