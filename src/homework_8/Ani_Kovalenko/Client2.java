package homework_8.Ani_Kovalenko;

public class Client2 implements CallBack {
    public void callBack(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " +
                "may also define other members, too");
    }
}
