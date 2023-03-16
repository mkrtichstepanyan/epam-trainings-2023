package homework_10.gohar_hakobyan.chapter_10;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "My Exception [" + detail + "]";
    }
}
