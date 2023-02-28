package homework_8.Karen_Sargsyan.Call_Back;

import javax.security.auth.callback.Callback;

public class TestIface {
    public static void main(String[] args) {

        Callback c = new Client();
        ((Client) c).callback(42);
    }

}
