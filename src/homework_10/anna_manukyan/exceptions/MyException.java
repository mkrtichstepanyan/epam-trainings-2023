package homework_10.anna_manukyan.exceptions;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }


    public String toString() {
        return "MyException[" +
                detail +
                ']';
    }
}
