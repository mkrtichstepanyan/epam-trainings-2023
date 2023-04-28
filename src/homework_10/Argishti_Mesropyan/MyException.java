package homework_10.Argishti_Mesropyan;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }
    public String toString(){
        return "MyException[" + detail + "]";
    }

}
