package homework_4.Ofelya_Khachatryan.StackTask;

public class A {
    public static void main(String[] args) {
        C c = new  C();
        D d = new D();
        d.setA(2);
        d.setB(2);
        c.calculate(d.getA(), d.getB() );

        System.out.println(d.getA());
        System.out.println(d.getB());
    }

    public int calculateSum(int a, int b) {
        return a + b;
    }
}
