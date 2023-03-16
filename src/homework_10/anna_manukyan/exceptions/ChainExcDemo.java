package homework_10.anna_manukyan.exceptions;

public class ChainExcDemo {
    static void demoProc(){
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw  e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e){
            System.out.println("Caught "+e);
            System.out.println("Original caught " +e.getCause());
        }
    }
}
