package homework_4.Roza_Petrosyan.task;

public class OverloadDemo {

    public OverloadDemo() {

    }

    public OverloadDemo(int item) {

    }

    public void doSomething() {

    }

    public void doSomething(int a) {

    }

    public void doSomething(int a, int b) {

    }

    public void doSomething(int a, double b) {

    }

//    public void doSomething(int b, double a) {  // here will not work overloading,
//                                                // parameter name difference have no sense if types are same
//    }

    public void doSomething(int a, Integer b) {

    }

    public void doSomething(Integer a, int b) {

    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();
        OverloadDemo demo2 = new OverloadDemo(5);
        Integer i = 2;
        demo.doSomething(2, 5);
        demo.doSomething(i, 5);

    }
}
