package homework_18.Ani_Kovalenko.chapter_15_lambda.example_15;

public class ConstructorRefDemo {

    public static void main(String[] args) {

        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func(100);

        System.out.println("val in mc is " + mc.getVal());
    }
}
