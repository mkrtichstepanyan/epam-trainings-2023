package homework_18.Ani_Kovalenko.chapter_15_lambda.example_1;

public class LambdaDemo {

    public static void main(String[] args) {

        MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println("A fixed value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());

//        myNum = () -> "123.03"; //error
    }
}
