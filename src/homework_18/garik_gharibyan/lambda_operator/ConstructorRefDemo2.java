package homework_18.garik_gharibyan.lambda_operator;

interface MyFuncCon2<T>{
    MyClass2<T> func(T t);
}
class MyClass2<T>{
    private T val;

    MyClass2(T t){
        this.val = t;
    }

    MyClass2(){
        this.val= null;
    }

    public T getVal() {
        return val;
    }
}
public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyFuncCon2<String> mf= MyClass2::new;
        MyClass2<String> func = mf.func("hello");

        System.out.println("Val in mf is: " + func.getVal());
    }
}
