package homework_1.Hayk_Davtyan;

public class ScopeErr {
    public static void main(String [] args){
        int bar = 1;
        {
             bar = 2;
        }
    }
}
