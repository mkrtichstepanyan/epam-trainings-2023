package homework_8.TatevKocharyan.interfaces;

public class Client implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("callback called with"+p);
    }
    void nonIfaceMeth(){
        System.out.println("Classes that implement interfacecs"+
                "may also define other members,too");
    }
}
