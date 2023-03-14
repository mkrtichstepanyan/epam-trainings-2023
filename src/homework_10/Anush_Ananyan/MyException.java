package homework_10.Anush_Ananyan;

public class MyException extends Exception {
    private int detail;
    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "MyException [" + detail + "]";
    }

}
