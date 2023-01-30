package homework_5.garik_gharibyan;

class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {

        Test1 ob = new Test1();
        int a = 15;
        int b = 20;

        System.out.println("a and before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and after call: " + a + " " + b);
    }
}
