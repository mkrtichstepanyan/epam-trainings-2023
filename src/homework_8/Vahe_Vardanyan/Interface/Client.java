package homework_8.Vahe_Vardanyan.Interface;

public class Client implements Callback {
    public  void callback(int p){
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth(){
        System.out.println("classes that implements interface " + " may also define other members, too.");
    }
}
