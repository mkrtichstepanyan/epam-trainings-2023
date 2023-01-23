package homework_1.radik_manasyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            bar = 2;
        }
    }
}
