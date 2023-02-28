package homework_8.garik_gharibyan.chapter_9.client;

public class AnotherClient implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + p*p);
    }
}
