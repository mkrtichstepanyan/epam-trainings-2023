package homework_8.Hovhannes_Gspeyan.simpleInterface;

public class AnotherClient implements Callback {

    @Override
    public void callback(int p) {
        System.out.println("Another version of callback ");
        System.out.println("p squared is " + (p * p));
    }
}
