package homework_10.Karen_Sargsyan.Chapter_10;

public class MyException extends Exception{
    private int detali;

    MyException(int a) {
        detali = a;
    }

    public String toString() {
        return "MyException[" + detali + "]";
    }
}

class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Called compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal exit");
    }

    public static void main(String[] args) throws MyException{
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Caught " + e);
        }
    }

}
