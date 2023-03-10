package homework_10.Yeghia_Ansuryan.Chapter_10.Exceptions;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("top layer");
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Caught: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
