package homework_4.Ofelya_Khachatryan.StackTask;

public class OverloadDemo {


    public void doSomething(){

    }

    public void doSomething(int a){

    }

    public void doSomething(int a, int b){

    }

    public void doSomething(int a, double b){

    }

    public static void main(String[] args) {
        OverloadDemo demo  = new OverloadDemo();
        demo.doSomething();
    }
}
