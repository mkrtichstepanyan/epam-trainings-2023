package homework_7.Lilit_Adamyan.chapter_9.p2;

import javax.security.auth.callback.Callback;

public class AnotherClient implements Callback {

    public void callBack(int p){
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
