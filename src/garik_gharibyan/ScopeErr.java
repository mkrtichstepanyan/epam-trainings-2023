package garik_gharibyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar = 2:   Compile-time error
        }
    }
}
