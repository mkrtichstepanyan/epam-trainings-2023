package homework_8.TatevKocharyan.interfaces.nestedClass;

public class A {
    public interface NestedF{
        public default boolean isNotNegative(int x){
            return x<0?false:true;
        }
    }
}
