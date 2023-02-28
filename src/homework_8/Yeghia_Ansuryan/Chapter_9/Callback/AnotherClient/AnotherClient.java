package homework_8.Yeghia_Ansuryan.Chapter_9.Callback.AnotherClient;

import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.Callback;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("P squared is " + (p * p));
    }
}
