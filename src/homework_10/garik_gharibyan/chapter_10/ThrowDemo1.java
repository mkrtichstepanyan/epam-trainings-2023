package homework_10.garik_gharibyan.chapter_10;

public class ThrowDemo1 {
    static void throwDem() throws IllegalAccessException {
            System.out.println("Inside throwOne");
            throw new IllegalAccessException("demo");
    }


    public static void main(String[] args) {
        try {
            throwDem();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }
}
