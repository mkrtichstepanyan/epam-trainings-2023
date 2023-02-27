package homework_8.gevorg_arghushyan_chapter_9;

public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("More one version callback()");
        System.out.println("p squared is " + (p * p));
    }
}
