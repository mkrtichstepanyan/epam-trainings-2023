package homework_8.Inesa_Mkrtchyan.Chapter_9.Interfaces;

public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
