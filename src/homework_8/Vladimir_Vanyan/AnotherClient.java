package homework_8.Vladimir_Vanyan;


public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback ");
        System.out.println("p squared is " + p * p);
    }
}
