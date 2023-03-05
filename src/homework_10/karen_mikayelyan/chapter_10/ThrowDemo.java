package homework_10.karen_mikayelyan.chapter_10;

public class ThrowDemo {
    static void demoProc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoProc.");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            System.out.println("ReCaught: " + e);
        }
    }
}
