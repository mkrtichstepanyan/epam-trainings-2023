package homework_8.shushanik_araqelyan_chapter9;

public class AnotherClient  implements Callback{
    //Implement Callback's interface
    public void callback(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
