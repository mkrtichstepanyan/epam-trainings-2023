package homework_10.Alina_Mkhoyan.chapter_10;

public class ThrowsDemo {
    static void throwOne(){
        System.out.println("Inside throwOne.");
        throw new IllegalArgumentException("demo");
    }

    public static void main(String[] args) {
        throwOne();
    }
}
