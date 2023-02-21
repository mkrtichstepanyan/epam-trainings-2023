package homework_4.Alina_Vardanovna.chapter7;

public class InnerClassDemo {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.test();

        Outer.Inner inner = outer.new Inner();
        inner.result();
    }
}
