package homework_4.Roza_Petrosyan.task;

public class A {

    protected void printSomething() {
        System.out.println("Hello World");
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }

    // we used overloading for calculateSum() method
    public Number calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        B b = new B();
        int c = 2;
        int d = 2;
        System.out.println("Copy by value:");
        b.calculate(c, d);

//        System.out.println(c);
//        System.out.println(d);

        C cObj = new C();
        System.out.println("Copy by reference:");
        cObj.setC(2);
        cObj.setD(2);
        b.calculate2(cObj);

    }
}
