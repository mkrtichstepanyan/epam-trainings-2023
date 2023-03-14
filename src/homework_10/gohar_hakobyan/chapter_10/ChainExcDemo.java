package homework_10.gohar_hakobyan.chapter_10;

public class ChainExcDemo {
    static void demoproc() {
        NullPointerException e = new NullPointerException("Top layer");
        e.initCause(new ArithmeticException("Cause"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Caught " + e);
            System.out.println("Original cause: " + e.getCause());
        }

    }

}
