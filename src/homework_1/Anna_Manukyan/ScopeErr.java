package homework_1.Anna_Manukyan;

//Scope error example
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
           //int bar = 2;
        }
    }
}
