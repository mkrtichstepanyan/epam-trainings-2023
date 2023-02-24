package homework_8.Ani_Barseghyan.callBack;

public class Client implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonIFaceMeth(){
        System.out.println("classes that implements interface " + "can also define other members, too.");
    }
}
