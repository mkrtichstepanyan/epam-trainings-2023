package homework_8.Roza_Petrosyan.Chapter_9.Interface;

public class Client implements Callback{

    @Override
    public void callBack(int param) {
        System.out.println("Callback called with " + param);
    }

    void nonIfaceMeth(){
        System.out.println("Classes that implement interfaces " +
                "may also define other members too.");
    }
}
