package homework_8.Yeghia_Ansuryan.Chapter_9.Callback.AnotherClient;

import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.AnotherClient.AnotherClient;
import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.Callback;
import homework_8.Yeghia_Ansuryan.Chapter_9.Callback.Client;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
