package homework_10.Vahe_Vardanyan;

public class ThrowsDemo {
    static void throwOne(){
        System.out.println("Inside throwOne.");
        try {
            throw new IllegalAccessException("demo");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

           throwOne();


}
}
