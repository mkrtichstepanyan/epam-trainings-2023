package homework_1.Vardan_Mkrtchyan;

public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar = 2;
            int x = 8;
        }
        int x = 9;
        System.out.println(x);
    }
}
