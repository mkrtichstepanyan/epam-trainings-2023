package homework_10.rafik_pahlevanyan.chapter_10;

//This program creates a custom exception type
public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString() {
        return "MyException[ " + detail + " ]";
    }
}

