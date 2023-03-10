package homework_10.Yeghia_Ansuryan.Chapter_10.MyException;

public class MyException extends Exception {
    private int detail;
    MyException (int a) {
        detail = a;
    }
    public String toString(){
        return "MyException[" + detail + "]";
    }
}
