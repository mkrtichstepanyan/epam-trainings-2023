package Anushik_Gevorgyan.homework1;

public class ScopeErr {
    public static void main(String[]args){
        int bar = 1;{

            int ba = 2;
        }
    }
}
