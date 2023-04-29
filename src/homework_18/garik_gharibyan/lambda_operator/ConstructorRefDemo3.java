package homework_18.garik_gharibyan.lambda_operator;

interface MyFuncCon3<R, T> {
    R func(T t);
}

class MyClass3<T> {
    private T val;

    MyClass3(T val) {
        this.val = val;
    }

    MyClass3() {
        this.val = null;
    }

    public T getVal() {
        return val;
    }
}

class MyClass4 {
    private String str;

    MyClass4(String str) {
        this.str = str;
    }

    MyClass4() {
        this.str = "";
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyFuncCon3<R, T> mf, T t) {
        return mf.func(t);
    }

    public static void main(String[] args) {
        MyFuncCon3<MyClass3<String>, String> mf1 = MyClass3::new;
        final MyClass3<String> mc = myClassFactory(mf1, "hello");
        System.out.println("val in mc is: " + mc.getVal());


        MyFuncCon3<MyClass4, String> mf2 = MyClass4::new;
        MyClass4 mc2 = myClassFactory(mf2, "HELLO");
        System.out.println("val in mc is: " + mc2.getStr());

    }
}
