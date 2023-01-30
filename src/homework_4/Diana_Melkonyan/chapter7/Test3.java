package homework_4.Diana_Melkonyan.chapter7;

public class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    //pas an object
    void meth(Test3 o){
        o.a *=2;
        o.b /=2;
    }
}

