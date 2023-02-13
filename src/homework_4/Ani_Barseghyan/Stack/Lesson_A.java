package homework_4.Ani_Barseghyan.Stack;

public class Lesson_A {
    public int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Lesson_C cObj = new Lesson_C();
        Lesson_D dObj = new Lesson_D();
        dObj.setC(2);
        dObj.setD(2);
        cObj.calculate(dObj);

        System.out.println(dObj.getC());
        System.out.println(dObj.getD());
    }
}
