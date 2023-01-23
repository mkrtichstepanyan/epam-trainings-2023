package homework_1.Hovhannes_Abrahamyan;


public class ScopeErr {
    public static void main(String args[]) {
        int bar = 1;
        {
//            int bar = 2;
        }
    }
}
