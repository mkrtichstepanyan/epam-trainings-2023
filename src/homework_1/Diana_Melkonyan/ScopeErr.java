package homework_1.Diana_Melkonyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {         // creates a new scope
           // int bar = 2; // Comple-time error-bar already definde!
        }
    }
}
