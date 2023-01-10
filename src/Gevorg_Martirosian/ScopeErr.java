//this program contains error
public class ScopeErr {
    public static void main(String[] args) {
        int bar = 1;
        {
            //int bar = 2;      if you remove the comment in this line, the program will not compile
            //error. variable bar is already defined
        }
    }
}
