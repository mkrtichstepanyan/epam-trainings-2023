package homework_10.Karen_Sargsyan.Chapter_10;

public class ThrowsDemo2 {
    static void throwTwo() throws IllegalAccessException {
        System.out.println("Inside throwTwo.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) throws IllegalAccessException {
        try {
            throwTwo();
        } catch (IllegalAccessException e) {
            System.out.println("Caught " + e);
        }
    }

}
