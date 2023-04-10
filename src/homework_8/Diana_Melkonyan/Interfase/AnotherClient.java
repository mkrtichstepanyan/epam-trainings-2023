package homework_8.Diana_Melkonyan.Interfase;

public class AnotherClient implements Callback{
    //Implement Callback's interface
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
