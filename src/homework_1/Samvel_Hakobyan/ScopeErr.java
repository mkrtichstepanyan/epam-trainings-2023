package homework_1.Samvel_Hakobyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1; // create a new scope
        {
          int bar1 = 2;// Compile-time error - bar already defines!
        }
    }
}
