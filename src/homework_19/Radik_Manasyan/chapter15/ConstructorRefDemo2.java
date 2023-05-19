package homework_19.Radik_Manasyan.chapter15;

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFunc5<Integer> myClassCons = MyClass3::new;

        MyClass3<Integer> mc = myClassCons.func(100);
        System.out.println("val in mc is " + mc.getVal());
    }
}
