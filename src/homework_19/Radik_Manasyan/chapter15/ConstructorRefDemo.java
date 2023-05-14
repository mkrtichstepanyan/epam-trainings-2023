package homework_19.Radik_Manasyan.chapter15;

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc4 myClassCons = MyClass2::new;

        MyClass2 mc = myClassCons.func(100);
        System.out.println("val in mc is " + mc.getVal());
    }
}
