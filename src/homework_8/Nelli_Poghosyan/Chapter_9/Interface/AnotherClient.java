package homework_8.Nelli_Poghosyan.Chapter_9.Interface;

public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
