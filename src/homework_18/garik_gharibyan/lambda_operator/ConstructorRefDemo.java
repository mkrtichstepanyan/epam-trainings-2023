package homework_18.garik_gharibyan.lambda_operator;

interface  MyFuncCon{
    MyClass1 func(int i);
}

class MyClass1{
    private final int val;

    MyClass1(int val){
        this.val = val;
    }
    MyClass1(){
        this.val = 0;
    }

    public int getVal() {
        return val;
    }
}
public class ConstructorRefDemo {
    public static void main(String[] args) {
        final MyFuncCon mf = MyClass1::new;
        final MyClass1 func = mf.func(100);
        System.out.println("Val is mf is: " + func.getVal());
    }
}
