package homework_1.Rafik_Pahlevanyan.chapter_3;

//This program will not compile
public class ScopeErr {
    public static void main(String[] args) {

        int bar = 1;
        { //create a new scope
         //   int bar = 2: // Compile-time error - bar already defined!
        }
    }
}
