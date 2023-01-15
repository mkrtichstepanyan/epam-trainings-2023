package homework_1.Varsik_Pijoyan;

public class ScopeErr {
    public static void main(String[] args){
        int bar=1;
        {
            bar=2;
        }
    }
}
