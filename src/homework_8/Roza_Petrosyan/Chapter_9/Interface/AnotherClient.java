package homework_8.Roza_Petrosyan.Chapter_9.Interface;

public class AnotherClient implements Callback {

    @Override
    public void callBack(int param) {
        System.out.println("Another version of callback");
        System.out.println("param sqaured is " + param * param);
    }
}
