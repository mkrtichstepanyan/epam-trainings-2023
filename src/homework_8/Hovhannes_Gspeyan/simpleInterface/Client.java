package homework_8.Hovhannes_Gspeyan.simpleInterface;

public class Client implements Callback{

    @Override
    public void callback(int param) {
        System.out.println("callback called with " + param);
    }
    void nonIFaceMeth(){
        System.out.println("classes that implements interface " + "can also define other members, too.");
    }
}
