package homework_8.TatevKocharyan.interfaces;

public class AnotherClient implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Aother version of callback");
        System.out.println("p squared is"+(p*p));
    }
}