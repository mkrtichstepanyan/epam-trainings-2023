package homework_8.Inesa_Mkrtchyan.Chapter_9.Interfaces;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("callback called with " + p);
    }
    void nonIfsceMeth(){
        System.out.println("Classes that implement interface " + "may also define other members, too.");
    }
}
