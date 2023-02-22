package homework_8.shushanik_araqelyan_chapter9;

public class Callback {
    public void callback(int p){
        System.out.println("callback called with " + p);
    }
    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces " + "may also define other members too.");
    }
}
