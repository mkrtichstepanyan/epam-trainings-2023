package homework_10.araksya_ghazaryan.chapter_10;

public class MyException extends Throwable {
    private int detail;
    MyException(int a) {
        detail = a;
    }
    public String toString() {
        return "MyException[ " + detail + " ]";
    }
}