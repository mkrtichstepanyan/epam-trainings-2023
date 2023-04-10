package homework_8.Karen_Sargsyan.Call_Back;

import javax.security.auth.callback.Callback;

public class AnotherClient implements Callback {

    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p * p));
    }

}
