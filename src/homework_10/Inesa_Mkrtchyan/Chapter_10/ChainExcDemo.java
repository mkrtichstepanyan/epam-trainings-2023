package homework_10.Inesa_Mkrtchyan.Chapter_10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("top Layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        }catch(NullPointerException e){
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
