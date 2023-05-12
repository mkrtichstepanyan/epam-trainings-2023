package homework_18.Ani_Kovalenko.chapter_15_lambda.example_16;

public class ConstructorRefDemo2 {

    public static void main(String[] args) {

        MyFunc<Integer> myClassCons = MyClass::new;
        MyClass<Integer> mc = myClassCons.func(100);
        System.out.println("val in mc is " + mc.getVal());

    }
}
