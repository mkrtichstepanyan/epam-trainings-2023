package classwork.interfacesexample;
// instance
public interface B {
    public static final int count = 0;

    default void bMethod() {
        System.out.println("In B interface");
    }

    ;
}
