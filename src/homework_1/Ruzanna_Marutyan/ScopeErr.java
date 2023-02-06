package homework_1.Ruzanna_Marutyan;
//This program will not compile
class ScopeErr {
    public static void main (String args[]) {
        int bar =1;
        {
                //create a new scope
           // int bar=2; //Compile-time error-bar already defined
        }
    }
}
