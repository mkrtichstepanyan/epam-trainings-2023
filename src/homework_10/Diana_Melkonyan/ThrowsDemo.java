package homework_10.Diana_Melkonyan;

public class ThrowsDemo {
    static void throwOne(){
        System.out.println("Inside throwOne.");
        throw new IllegalArgumentException("demo");
    }

    public static void main(String[] args) {
        throwOne();
    }
}
