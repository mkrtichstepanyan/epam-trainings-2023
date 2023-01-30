package homework_4.Roza_Petrosyan.task;

public class B extends A {

    @Override
    public void printSomething() {          // access modifier can be one or
        System.out.println("Hi");           // more level higher from parent access modifier
    }

    @Override
    public int calculateSum(int c, int d) {

        System.out.println("Calculating...");
        return c + d;
    }

    @Override
    public Integer calculateSum(int a, int b, int c) {
        System.out.println("Calculating...");
        return a + b + c;
    }

    // copy by value primitive type
    public void calculate(int c, int d) {
        c = 10 * d;
        d = 12 * d;

        System.out.println(c);
        System.out.println(d);
    }

    // copy by value reference type
    public void calculate2(C c) {
        c.setC(10 * c.getC());
        c.setD(12 * c.getD());

        System.out.println(c.getC());
        System.out.println(c.getD());
    }
}
