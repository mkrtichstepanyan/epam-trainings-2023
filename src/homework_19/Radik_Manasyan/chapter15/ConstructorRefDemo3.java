package homework_19.Radik_Manasyan.chapter15;

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc6<MyClass3<Double>, Double> myClassCons = MyClass3::new;

        MyClass3<Double> mc = myClassFactory(myClassCons, 100.1);
        System.out.println("val in mc is " + mc.getVal());

        MyFunc6<MyClass4, String> myClassCons2 = MyClass4::new;

        MyClass4 mc2 = myClassFactory(myClassCons2, "Lambda");
        System.out.println("val in str onj is " + mc2.getVal());
    }
}
