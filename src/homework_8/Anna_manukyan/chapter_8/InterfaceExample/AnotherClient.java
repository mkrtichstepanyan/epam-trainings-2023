package homework_8.Anna_manukyan.chapter_8.InterfaceExample;

public class AnotherClient implements CallBack {
    @Override
    public void callBack(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " +(p*p));
    }
}
