package homework_8.Alina_Mkhoyan.chapter_9;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback () ");
        System.out.println("p squared is  " + (p * p));
    }
}