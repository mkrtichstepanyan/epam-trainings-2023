package homework_10.Varsik_Pijoyan.chapter_10;

public class MyException  extends Exception{
    private int detail;

    MyException(int a){
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail + ']';
    }
}
