package homework_10.garik_gharibyan.chapter_10;

class MyException extends Exception {
    private int detail;
    MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException [" + detail + "]";
    }
}

public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("Called compute (" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Normal exist");
    }

    public static void main(String[] args) {
        try {
            compute(5);
            compute(11);
        }catch (MyException e){
            System.out.println("Caught "+ e);
        }
    }
}


