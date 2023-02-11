package homework_6.Inesa_Mkrtchyan.Chapter_8;

class B3 extends A3{
    int i;
    B3(int a, int b) {
        super.i = a; // i in A
        i = b; // i in B
    }
    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
