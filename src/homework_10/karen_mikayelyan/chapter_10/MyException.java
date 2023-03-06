package homework_10.karen_mikayelyan.chapter_10;

public class MyException extends Exception{
    private int detail;

    MyException(int a) {
        detail = a;
    }
    public String toString(){
        return "MyException [" + detail + "] ";
    }
}
