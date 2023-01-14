package homework_1.gevorg_arghushyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
          //  int bar = 2; compile-time error - variable bar
                             //already defined
        }
    }
}
