package homework_8.Vahe_Vardanyan.Interface;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces" + "may also define other members, too.");
    }
}
