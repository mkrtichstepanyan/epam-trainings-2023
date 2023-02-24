package homework_8.rafik_pahlevanyan.chapter_9;

//Another implementation of Callback
public class AnotherClient implements Callback {
    //implement Callback`s interface
    public void callback(int p) {
        System.out.println("Another version of callback () ");
        System.out.println("p squared is  " + (p * p));
    }
}