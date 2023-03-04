package homework_10.Roza_Petrosyan.chapter_10.chained_exception;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("top layer");

        e.initCause(new AbstractMethodError("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Caught e: " + e);

            System.out.println("Original cause: " + e.getCause());
        }
    }
}
