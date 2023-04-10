package homework_10.Liana_Gevorgyan.my_exception;

public class MyException  extends Exception{
    private int detail;

    MyException(int a) {
        detail = a;
    }

    public String toString(){
        return "MyException[" + detail + "]";
    }
}
