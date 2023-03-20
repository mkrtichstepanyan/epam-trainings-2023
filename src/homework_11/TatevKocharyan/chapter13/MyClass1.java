package homework_11.TatevKocharyan.chapter13;

public class MyClass1 {
    int a;
    int b;

    public MyClass1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    MyClass1(int i){
        this(i,i);
    }
    MyClass1(){
        this(0);
    }



}
