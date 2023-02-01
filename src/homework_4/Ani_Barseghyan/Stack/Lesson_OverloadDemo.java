package homework_4.Ani_Barseghyan.Stack;


public class Lesson_OverloadDemo {
    public void doSomething() {

    }

    public void doSomething(int a) {

    }

    public void doSomething(int a, int b) {

    }

    public void doSomething(int a, double b) {

    }

    public static void main(String[] args) {
        Lesson_OverloadDemo demo = new Lesson_OverloadDemo();
        demo.doSomething(1, 3);
    }

}
