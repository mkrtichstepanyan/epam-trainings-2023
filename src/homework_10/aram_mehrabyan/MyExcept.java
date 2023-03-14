package homework_10.aram_mehrabyan;

public class MyExcept extends Exception {
    private int detail;
    MyExcept(int a){
        detail=a;
    }
    public String toString(){
        return "MyExcept["+detail+"]";
    }
}
class ExceptionDemo{
    static void compute(int a) throws MyExcept{
        System.out.println("Called compute("+a+")");
        if(a>10)
            throw new MyExcept(a);
        System.out.println("Normal exit");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);

        } catch (MyExcept e){
            System.out.println("Caught "+e);
        }
    }
}
