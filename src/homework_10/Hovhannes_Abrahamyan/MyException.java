package homework_10.Hovhannes_Abrahamyan;

class MyException extends Exception{
    private int detail;

    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "My exception [" + detail + "]";
    }
}