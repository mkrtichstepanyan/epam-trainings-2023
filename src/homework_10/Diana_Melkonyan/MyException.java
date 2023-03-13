package homework_10.Diana_Melkonyan;

public class MyException extends Exception{
    private int detail;
    MyException(int a){
        detail=a;
    }
    public String toString(){
        return "My Exception[" + detail +"]";
    }
}
