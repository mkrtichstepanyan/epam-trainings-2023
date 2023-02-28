package homework_8.garik_gharibyan.chapter_9.client;

public class Client implements Callback{
    @Override
    public void callback(int p) {
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces may also define other members, too");
    }
}
