package homework_8.homework_8_liana_gevorgyan.callBack;

public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonIFaceMeth(){
        System.out.println("classes that implements interface " + "can also define other members, too.");
    }
}
