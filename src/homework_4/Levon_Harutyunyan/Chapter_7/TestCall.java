package homework_4.Levon_Harutyunyan.Chapter_7;

public class TestCall {
    int a;
    int b;

    TestCall(int i , int j){
        a = i;
        b = j;
    }

    public TestCall() {

    }

    public void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    public void meth(TestCall o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class CallByValue {

    public static void main(String args[]) {

        TestCall ob = new TestCall();
        int a = 15;
        int b = 20;

        System.out.println("a and b befor call: " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " + a + " " + b);

        System.out.println();

        TestCall ob1 = new TestCall(15, 20);
        System.out.println("ob1.a and ob1.b befor call: " + ob1.a + " " + ob1.b);
        ob1.meth(ob1);
        System.out.println("ob1.a and ob1.b after call: " + ob1.a + " " + ob1.b);
    }
}
