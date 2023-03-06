package homework_10.Inesa_Mkrtchyan.Ex;

public class MyException extends Exception{
    private String errorText;

    public MyException(String e){
        errorText = e;
    }
    @Override
    public String toString() {
        return errorText;
    }
}
