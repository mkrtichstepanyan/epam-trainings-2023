package homework_8.Nona_Asatryan.chapter9.interfaceExamples;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }
}
