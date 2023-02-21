package homework_7.Anna_Manukyan.chapter_8.interfaceExample;

public class AnotherClient implements CallBack {
    @Override
    public void callBack(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " +(p*p));
    }
}
