package homework_10.aram_mehrabyan;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwone.");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        } catch (IllegalAccessException e){
            System.out.println("Caught "+e);
        }
    }
}
