package homework_10.Hovhannes_Gspeyan.chapter_10;

public class ChainExcDemo {
    static void demoProc(){
        NullPointerException e = new NullPointerException("Top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoProc();
        }catch (NullPointerException e){
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
