package homework_8.robert_nazaryan;

//Another implementation of Callback
public class AnotherClient implements Callback {
    //implement Callback`s interface
    public void callback(int p) {
        System.out.println("Another version of callback () ");
        System.out.println("p squared is  " + (p * p));
    }
}