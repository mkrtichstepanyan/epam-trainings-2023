package homework_10.Samvel_Hakobyan;

public class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }
    public String toString(){
        return "MyException[" + detail + "]";
    }
}
class ExceptionDemo{
    static void compute(int a)throws  MyException{
        System.out.println("Called compute(" + a +")");
        if (a > 10){
            System.out.println("Normal exit");
        }
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        }catch (MyException e){
            System.out.println("Caught " + e);
        }
    }

}
