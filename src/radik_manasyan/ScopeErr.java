package radik_manasyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            int bar = 2;
        }
    }
}
