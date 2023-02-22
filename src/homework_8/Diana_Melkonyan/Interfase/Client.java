package homework_8.Diana_Melkonyan.Interfase;

public class Client implements Callback{
    //Implement Callback's interface

    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}
