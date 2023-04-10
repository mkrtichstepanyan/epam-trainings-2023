package homework_8.Karen_Sargsyan.Call_Back;

import javax.security.auth.callback.Callback;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        ((Client) c).callback(42);
        c = ob;
        ((AnotherClient) c).callback(42);
    }

}
