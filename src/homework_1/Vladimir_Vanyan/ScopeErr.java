package homework_1.Vladimir_Vanyan;

public class ScopeErr {
    int bar = 1;

    {
        // creates a new scope
        //int bar = 2; // Compile-time error - bar already defined !
    }
}
