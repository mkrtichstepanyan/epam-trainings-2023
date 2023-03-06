package homework_10.Lilit_Adamyan.Chaper_10_Exceptions;

public class ChainExcDemo {
    static void demoProc(){
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch(NullPointerException e){
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
